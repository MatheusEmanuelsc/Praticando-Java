package praticando13.application;

import java.util.Scanner;



import praticando13.model.entities.Conta;
import praticando13.model.exception.LimiteSaqueUltrapassado;
import praticando13.model.exception.NaoPodedepositaOuRetirarMenorOuZeroValor;
import praticando13.model.exception.SemSaldoException;

public class Program {

	public static void main(String[] args) {
		
		Scanner entradaDados= new Scanner(System.in);
		
		try {
			System.out.println("Entre com a conta: ");
			
			System.out.println("Qual o nome ? ");
			String nome= entradaDados.nextLine();
			
			System.out.println("Qual o numero da conta? ");
			Integer numeroConta = entradaDados.nextInt();
			
			System.out.println("Qual o limite de retirada? ");
			Double limiteRetirada = entradaDados.nextDouble();
			
			System.out.println("Qual o saldo inicial? ");
			Double saldoIncial = entradaDados.nextDouble();
			
			
			
			Conta conta = new Conta(numeroConta, nome, saldoIncial, limiteRetirada);
			
			System.out.println("Qual o valor você deseja retirar? ");
			Double retirada =entradaDados.nextDouble();
			
			conta.retirada(retirada);
			
			System.out.println("Novo saldo: "+conta.getSaldo());
			
			
		}catch (SemSaldoException e) {
			
			System.out.println(e.getMessage());
			
		}catch (LimiteSaqueUltrapassado e) {
			
			System.out.println(e.getMessage());
			
		}catch (NaoPodedepositaOuRetirarMenorOuZeroValor e) {
			
			System.out.println(e.getMessage());
			
		}catch ( Exception e) {
			
			System.out.println( e.getMessage());
		}finally {
			entradaDados.close();
		}
		
	}
}
