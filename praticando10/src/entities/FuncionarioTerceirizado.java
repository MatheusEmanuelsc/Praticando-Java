package entities;

public class FuncionarioTerceirizado extends Funcionario {
	
	private Double  custoAdicional;
	private Double  porcetagemCompensatoria = 1.1;

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	
	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	public Double getPorcetagemCompensatoria() {
		return porcetagemCompensatoria;
	}
	
	public void setPorcetagemCompensatoria(Double porcetagemCompensatoria) {
		this.porcetagemCompensatoria = porcetagemCompensatoria;
	}
	
	
	@Override
	public Double pagamento() {
		
		return super.pagamento()+getCustoAdicional()*porcetagemCompensatoria;
	}


	@Override
	public String toString() {
		return "FuncionarioTerceirizado [custoAdicional=" + custoAdicional + ", porcetagemCompensatoria="
				+ porcetagemCompensatoria + "]";
	}

	
	
	
	

}
