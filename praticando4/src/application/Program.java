package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int totalValores=0;
		double mediaValores=0;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Quantos  numeros  você deseja digitar? ");
		int quantidadeDigitos = entradaDados.nextInt();

		int[] numeros = new int[quantidadeDigitos];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Digite o " + (i + 1) + " numero: ");
			numeros[i] = entradaDados.nextInt();
		}
		entradaDados.close();

		System.out.print("Valores Digitados: ");
		for (int i : numeros) {
			
			System.out.print(" "+i+" ");
			totalValores+=i;

		}
		mediaValores=totalValores/quantidadeDigitos;
		System.out.println("\nSoma De  todos os valores: "+totalValores);
		System.out.println("Media de valores: "+ mediaValores);

	}
}
