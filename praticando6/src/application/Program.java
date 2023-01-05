package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Quantos funcionarios vocẽ deseja adcionar");
		int quantidadeFuncionarios = entradaDados.nextInt();

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		for (int i = 0; i < quantidadeFuncionarios; i++) {

			entradaDados.nextLine();

			System.out.println("Digite o nome  do funcionario numero " + (i + 1) + ":");
			String nome = entradaDados.nextLine();

			System.out.println("Digite o Id  do funcionario numero " + (i + 1) + ":");
			int id = entradaDados.nextInt();

			System.out.println("Digite o salario  do funcionario numero " + (i + 1) + ":");
			double salario = entradaDados.nextDouble();

			listaFuncionarios.add(new Funcionario(nome, id, salario));

		}

		System.out.println("Qual o id do salario  que deseja aumentar? ");
		int idSalario = entradaDados.nextInt();

		int pos = validaId(idSalario, listaFuncionarios);
		
		if (pos != -1) {

			System.out.println("Qual porcetagem de salario de salario vocẽ deseja adicionar? ");
			double porcetagem = entradaDados.nextDouble();

			listaFuncionarios.get(pos).AumentaSalario(porcetagem);
			
			}
		 else {
			System.out.println("ID não encontrado");
		}

		
		entradaDados.close();
		
		
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}

	}

	public static int validaId(int id, List<Funcionario> lis) {

		for (Funcionario list : lis) {

			if (list.getId() == id) {
				return id;
			}

		}
		return -1;

	}
}
