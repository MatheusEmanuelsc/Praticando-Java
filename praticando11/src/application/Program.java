package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Produto> prod = new ArrayList<>();
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Quantos Produtos Você pretende cadastrar?");
		int numeroCadastros = entradaDados.nextInt();

		for (int i = 1; i <= numeroCadastros; i++) {

			System.out.println("Dados produto #" + i);

			entradaDados.nextLine();

			System.out.println("O Produto e Importado = i ,Fabricado = f ou Usado = u");
			String tipoProduto = entradaDados.nextLine();

			System.out.println("Qual o nome do produto: ");
			String nome = entradaDados.nextLine();

			System.out.println("Qual  o preço do produto");
			Double preco = entradaDados.nextDouble();

			if (tipoProduto.equalsIgnoreCase("i")) {

				System.out.println("Qual a taxa de importação");
				Double custoImportação = entradaDados.nextDouble();

				prod.add(new ProdutoImportado(nome, preco, custoImportação));

			} else if (tipoProduto.equalsIgnoreCase("u")) {
				entradaDados.nextLine();
				System.out.println("Qual a data de fabricação? dd/MM/yyyy");
				String data = entradaDados.nextLine();

				LocalDate dataFabricacao = LocalDate.parse(data, formataData);

				prod.add(new ProdutoUsado(nome, preco, dataFabricacao));
			} else {

				prod.add(new Produto(nome, preco));
			}

		
		}
		entradaDados.close();
		
		for (Produto produto : prod) {
			
			System.out.println(produto.etiquetaDePreco());
			
			
		}
	}
}