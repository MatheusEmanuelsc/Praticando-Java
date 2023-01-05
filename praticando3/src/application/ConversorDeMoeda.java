package application;

import java.util.Scanner;

import util.Converte;

public class ConversorDeMoeda {

	
	public static void main(String[] args) {
		
		Scanner  entradaDados=  new Scanner(System.in);
		System.out.println("valor da Cotação do  Dolar? ");
		double  valorDolar= entradaDados.nextDouble();
		System.err.println("Quantidade de Dolares a serem Convertidos? ");
		double  quantidadeDolar = entradaDados.nextDouble();
		entradaDados.close();
		
		double val=Converte.converte(valorDolar, quantidadeDolar);
		
		System.out.println("Valor liquido e :"+ val);
	}
}
