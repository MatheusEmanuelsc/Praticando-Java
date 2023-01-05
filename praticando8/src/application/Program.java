package application;


import java.util.Scanner;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner entradaDados = new Scanner(System.in);
		
		
		System.out.println("Qual o titulo do post? ");
		String titulo =entradaDados.nextLine();
		
		System.out.println("Oque voçẽ deseja escrever? ");
		String conteudo=  entradaDados.nextLine();
		
		
		System.out.println("numero de curtidas? ");
		int curtidas = entradaDados.nextInt();
		
		
		Post post1 = new Post(titulo, conteudo, curtidas);
		
		entradaDados.nextLine();
		
		System.out.println("Qual Comentario você deseja adicionar? ");
		String comentario = entradaDados.nextLine();
		
		Comentario comenta = new Comentario(comentario);
		
		post1.adcionarComentarios(comenta);
		
		System.out.println(post1);
		
		
		
		entradaDados.close();
	}
}
