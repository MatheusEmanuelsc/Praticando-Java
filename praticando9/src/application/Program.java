package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusOrdem;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner entradaDados = new Scanner(System.in); 
		
		System.out.println("Qual o nome do cliente: ");
		String nome = entradaDados.nextLine();
		
		System.out.println("Qual o email do cliente: ");
		String email = entradaDados.nextLine();
		
		System.out.println("Qual a Data de nascimento do cliente? dd/MM/yyyy:  ");
		String dataNascimento = entradaDados.nextLine();
		
		LocalDate dataNasc = LocalDate.parse(dataNascimento, formataData);
		
		Cliente  cliente = new Cliente(nome, email, dataNasc);
		
		
		System.out.println("Pedido: ");
		
		
		System.out.println("Qual Status do pedido: ");
		String momento= entradaDados.nextLine();
		StatusOrdem status = StatusOrdem.valueOf(momento);
		
		System.out.println("Quantos pedidos  você deseja fazer? ");
		int quantidadePedidos = entradaDados.nextInt();
		
		
		Pedido pedido= new Pedido(status, cliente);
		for (int i = 1; i <= quantidadePedidos; i++) {
			
			entradaDados.nextLine();
			
			System.out.println("Pedido numero #"+i);
			
			System.out.println("Nome do  produto ");
			String  nomeProduto = entradaDados.nextLine();
			
			System.out.println("Qual o preço?");
			double precoProduto= entradaDados.nextDouble();
			
			System.out.println("Qual a quantidade de produtos");
			int quantidadeProdutos= entradaDados.nextInt();
			
			Produto produto = new Produto(nomeProduto, null);//resolvir deixa null mesmo  nisso aqui pois não faria sentido adc agora..
			
			ItemPedido itempedido = new ItemPedido(quantidadeProdutos, precoProduto, produto);
			
			pedido.adicionarItem(itempedido);
		}
		
		
		System.out.println(pedido);
		
		
		entradaDados.close();
	}
}
