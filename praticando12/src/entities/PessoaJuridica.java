package entities;

public class PessoaJuridica extends Pessoa{

	private Integer numeroDeFuncionarios;
	
	private Integer verificarNumeroFuncionarios=10;
	private Double taxaImposto ;

	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	
	@Override
	public Double calculoImposto() {
		
		if (getNumeroDeFuncionarios()>verificarNumeroFuncionarios) {
	
			taxaImposto=0.14;
			Double  imposto= getRendaAnual()*taxaImposto;
			return imposto;
			
		} else {
			taxaImposto=0.16;
			Double  imposto= getRendaAnual()*taxaImposto;
			return imposto;
		}

	}

	@Override
	public String toString() {
		return "PessoaJuridica [numeroDeFuncionarios=" + numeroDeFuncionarios + "]";
	}

	
	
	
	
	
}
