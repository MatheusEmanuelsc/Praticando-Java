package entities;

public class ItemPedido {

	private Integer quantidade;
	private Double  preco;
	
	private Produto produto;

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		double result= getPreco()*getQuantidade();
		return result;
		
	} 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do produto: "+getProduto().getNome());
		sb.append(", Preço do produto: "+getPreco());
		sb.append(", Quantidade do produto: "+getQuantidade());
		
		return sb.toString();
	}
	
	
	
	
}
