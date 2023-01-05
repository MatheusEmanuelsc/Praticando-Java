package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.ContratosHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.nivelFuncionario;

public class Program {

	
	public static void main(String[] args) {
		
		DateTimeFormatter FormatadorDatas =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Qual o departamento? ");
		String nomeDepartamento = entradaDados.nextLine();		
		
		System.out.println("Qual o nome do funcionario? ");
		String nome = entradaDados.nextLine();
		
		System.out.println("Qual o nivel  do  funcionario? Junior,Pleno ou Senior:  ");
		String nivel = entradaDados.nextLine();
					
		System.out.println("Qual salario base do  funcionario? ");
		double salario= entradaDados.nextDouble();
		
		nivelFuncionario  niv = nivelFuncionario.valueOf(nivel);
		Departamento  departamento = new Departamento(nomeDepartamento);
		Funcionario funcionario =new Funcionario(nome, niv, salario, departamento);		
		
		System.out.println("Quantos Contratos vocẽ deseja adicionar? ");
		int quantidadeContratos = entradaDados.nextInt();
		
		for (int i = 1; i <= quantidadeContratos; i++) {
			
			entradaDados.nextLine();
			System.out.println("Contrato numero #"+i);
			System.out.println("Qual data a ? dd/mm/yyyy: ");
			String data =entradaDados.nextLine();
			LocalDate dataContrato = LocalDate.parse(data, FormatadorDatas);
			
			System.out.println("Quantidade de horas? ");
			int hora =entradaDados.nextInt();
			
			System.out.println("Qual o valor da hora? ");
			double valorHora = entradaDados.nextDouble();
			
			funcionario.adicionarContratos(new ContratosHora(dataContrato, valorHora, hora));
			
		}
		entradaDados.nextLine();
		System.out.println("Qual data do contrato deseja verificar? dd/mm/yyyy: ");
		String data =entradaDados.nextLine();
		LocalDate dataContratoVerificar = LocalDate.parse(data, FormatadorDatas);
		
		
		
		
		double renda =funcionario.rendaMes(dataContratoVerificar);
		
		
		System.out.println("Nome Do  funcionario: "+funcionario.getNomeFuncionaro());
		System.out.println("Departamento Do  funcionario: "+funcionario.getDepartamento().getnomeDepartamento());
		System.out.println("Renda Do periodo "+data+" foi de : " +renda);
		
		
		
		entradaDados.close();
		
	}
}
