package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoComSaude;
	
	private Double verificarRenda=20000D;
	private Double taxaDeImposto;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	
	@Override
	public Double calculoImposto() {
		Double imposto;
		if (getRendaAnual()<verificarRenda) {
			taxaDeImposto=0.15;
			imposto=getRendaAnual()*taxaDeImposto;
			return imposto;
		} else {
			
			taxaDeImposto=0.25;
			imposto=(getRendaAnual()*taxaDeImposto)-(getGastoComSaude()*0.50);
			return imposto;
		}

		
		
	}
	@Override
	public String toString() {
		return "PessoaFisica [gastoComSaude=" + gastoComSaude + "]";
	}

	
	
	
	
}
