package application;

import java.util.Scanner;
import entities.Retangulo;
public class Program {
	
	public static void main(String[] args) {
		
		
		Scanner entraDados= new Scanner(System.in);
		
		System.out.println("Qual Altura?");
		double altura= entraDados.nextDouble();
		
		System.out.println("Qual Largura?");
		double largura= entraDados.nextDouble();
		entraDados.close();
		
		Retangulo retangulo = new Retangulo(largura, altura);
		System.out.println(retangulo);
	}

}
