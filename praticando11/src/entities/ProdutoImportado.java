package entities;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandegaria;

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	@Override
	public String etiquetaDePreco() {
		String result =(super.getNome()+" $ "+precoTotal()+" ")+(" (Custo de importação: $ "+getTaxaAlfandegaria()+" )");
		return result;
	}
	
	public Double precoTotal() {
		Double  precoTot = super.getPreco()+getTaxaAlfandegaria();
		
		return precoTot;
	}

	@Override
	public String toString() {
		return "ProdutoImportado [taxaAlfandegaria=" + taxaAlfandegaria + "]";
	}
	
	
	
}
