package praticando13.model.entities;

import praticando13.model.exception.LimiteSaqueUltrapassado;
import praticando13.model.exception.NaoPodedepositaOuRetirarMenorOuZeroValor;
import praticando13.model.exception.SemSaldoException;

public class Conta {

	private Integer numeroDaConta;
	private String nome;
	private Double saldo;
	private Double limiteDeSaque;

	public Conta(Integer numeroDaConta, String nome, Double saldo, Double limiteDeSaque) throws NaoPodedepositaOuRetirarMenorOuZeroValor {

		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		if (saldo>=0) {
			this.saldo = saldo;
		}else {
			throw new NaoPodedepositaOuRetirarMenorOuZeroValor("Não pode depositar um valor menor que: 0.00");
		}
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposita(Double deposito ) throws NaoPodedepositaOuRetirarMenorOuZeroValor {
		if(deposito<0) {
			throw new NaoPodedepositaOuRetirarMenorOuZeroValor("Erro!!! Não  pode deposita o valor: 0,00");
		}
		
		this.saldo+=deposito;
	}
	
	
	public void retirada(double saque) throws SemSaldoException, LimiteSaqueUltrapassado, NaoPodedepositaOuRetirarMenorOuZeroValor {
		
		Boolean TemSaldoParaSaque =(getSaldo()>=saque);
		Boolean estaAbaixoLimiteConta =(getLimiteDeSaque()>=saque);
		Boolean SaqueMaiorQueZero =(saque>0);
		if ( !TemSaldoParaSaque ) {
			
			throw new SemSaldoException("Erro!!! Saldo insuficiente");
			
		} else if(!estaAbaixoLimiteConta){

			throw new LimiteSaqueUltrapassado("Erro!!! Limite de saque ultrapssado");
			
		} else if(!SaqueMaiorQueZero) {
			
			throw new NaoPodedepositaOuRetirarMenorOuZeroValor("Erro!!! Não  pode retira o valor: 0,00");
		}
		
		this.saldo-=saque;
	}

	@Override
	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", nome=" + nome + ", saldo=" + saldo + ", limiteDeSaque="
				+ limiteDeSaque + "]";
	}


	
	
}	