package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		List<Funcionario> func = new ArrayList<>(); 
		
		System.out.println("Quantos Funcionários deseja cadastrar?  ");
		int numeroCadastros = entradaDados.nextInt();
		
		
		for (int i = 1; i <= numeroCadastros; i++) {
			entradaDados.nextLine();
			
			System.out.println("Cadastro de  funcionario  #"+i);
			
			System.out.println("Qual o nome? ");
			String nome = entradaDados.nextLine();
			
			System.out.println("Quantidade de Horas? ");
			Integer horas= entradaDados.nextInt();
			
			System.out.println("Qual o valor por  hora? ");
			Double valorHora =entradaDados.nextDouble();  
			
			entradaDados.nextLine();
			System.out.println("E terceirizado? Sim ou Não? ");
			String eTerceirizado = entradaDados.nextLine();
			
			if (eTerceirizado.equalsIgnoreCase("não")) {
				
				 func.add(new Funcionario(nome, horas, valorHora)) ;
				
			} else {
				
				System.out.println("Qual o valor  do custo adicional?");
				Double custoadicional = entradaDados.nextDouble();
				
				func.add(new FuncionarioTerceirizado(nome, horas, valorHora, custoadicional));
				
			}
			
		}
		entradaDados.close();
		
		System.out.println("Pagamentos: ");
		for (Funcionario funcionario : func) {
			System.out.println(funcionario.getNome()+" - $ "+ Math.round(funcionario.pagamento()));
		}
		
	}
}
