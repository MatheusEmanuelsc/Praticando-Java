package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		
		double somaAltura=0;
		double alturaMedia=0;
		int somaMenorIdade=0;
		double mediaMenorIdade=0;
		
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Quantas  pessoas   você deseja adicionar? ");
		int quantidadePessoas = entradaDados.nextInt();

		Pessoa[] pessoa = new Pessoa[quantidadePessoas];

		for (int i = 0; i < pessoa.length; i++) {

			entradaDados.nextLine();
			System.out.println("Digite o nome "+(i+1)+ " : ");
			String  nome = entradaDados.nextLine();
			
			System.out.println("Digite a idade "+(i+1)+ " : ");
			int idade = entradaDados.nextInt();
			
			System.out.println("Digite a altura "+(i+1)+ " : ");
			double altura =entradaDados.nextDouble();
			
			pessoa[i]=new Pessoa(nome, idade, altura);
		}
		entradaDados.close();
		
		for (Pessoa pessoa2 : pessoa) {
			
			somaAltura+=pessoa2.getAltura();
			
			if (pessoa2.getIdade()<16) {
				
				System.out.println("é menor de 16: "+ pessoa2.getNome());
				somaMenorIdade +=1;
			} 
		}
		
		alturaMedia= somaAltura/quantidadePessoas;
		if (somaMenorIdade>0) {
			mediaMenorIdade= (somaMenorIdade*100)/quantidadePessoas;
		} 
		
		System.out.println("A altura media e: "+alturaMedia);
		System.out.println("Porcetagem de pessoas com -16 anos = "+mediaMenorIdade);
		
	}

}
