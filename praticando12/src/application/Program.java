package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Double total=0d;
		
		List<Pessoa>pessoa = new ArrayList<>();
		Scanner entradaDados = new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas deseja Cadastrar? ");
		Integer numeroPessoas= entradaDados.nextInt();
		
		for (int i = 1; i <= numeroPessoas; i++) {
			
			System.out.println("Pessoa numero: #"+i);
			entradaDados.nextLine();
			
			System.out.println("Pessoa Fisica = F ou Pessoa Juridica = J ? ");
			String tipoPessoa = entradaDados.nextLine();
			
			System.out.println("Qual o nome ?");
			String  nome = entradaDados.nextLine();
			
			System.out.println("Qual a  renda anual?");
			Double rendaAnual = entradaDados.nextDouble();
			
			if (tipoPessoa.equalsIgnoreCase("j")) {
				
				System.out.println("Numero de Funcionarios? ");
				Integer numeroFuncionarios = entradaDados.nextInt();
				
				pessoa.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			} else {
				
				System.out.println("Qual o valor do Gasto com saude?? ");
				Double gastoSaude = entradaDados.nextDouble();
				
				pessoa.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			
		}
		entradaDados.close();
		
		System.out.println("Taxa de pagamentos: ");
		for (Pessoa pessoa2 : pessoa) {
			Double imposto =pessoa2.calculoImposto();
			total+=imposto;
			System.out.println("Nome:  "+pessoa2.getNome()+" Valor:  $ "+Math.round(imposto));
			
		}
		
		System.out.println("Valor total a ser  pago: $ "+total);
	}
}
