package application;

import java.util.Scanner;

import entities.Funcionario;
public class Program {
	
	public static void main(String[] args) {
		
		Scanner entradaDados= new Scanner(System.in);
		System.out.println("Qual o nome do funcionario? ");
		String nome= entradaDados.nextLine();
		System.out.println("Qual o valor do salario?");
		double salario=entradaDados.nextDouble();
		System.out.println("Qual valor do  imposto? ");
		double impo = entradaDados.nextDouble();
		
		Funcionario func = new  Funcionario(nome, salario, impo);
		
		System.out.println(func);
		System.out.println("Salario liguido: "+func.salarioLiquido());
		
		System.out.println("Qual a porcetagem do aumento de salario? ");
		double aumento = entradaDados.nextDouble();
		entradaDados.close();
		System.out.println("Osalario com bonus : " +func.salarioComBonus(aumento));
		
		
	}

}
