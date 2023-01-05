package entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {

	private LocalDate dataDeFabricacao;

	public ProdutoUsado(String nome, Double preco, LocalDate dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public LocalDate getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	
	@Override
	public String etiquetaDePreco() {
		String result = (super.getNome()+" (Usado) $"+super.getPreco()+" (Data da fabricação: "+getDataDeFabricacao()+")");
		return result;
	}
	@Override
	public String toString() {
		return "ProdutoUsado [dataDeFabricacao=" + dataDeFabricacao + "]";
	}
	
	
	
}
