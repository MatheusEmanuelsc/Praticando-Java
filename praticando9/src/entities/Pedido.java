package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusOrdem;

public class Pedido {

	private LocalDateTime data ;
	private StatusOrdem status;
	
	private Cliente cliente;
	
	private List<ItemPedido>items= new ArrayList<>();

	public Pedido(StatusOrdem status, Cliente cliente) {
		this.data = LocalDateTime.now();
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public StatusOrdem getStatus() {
		return status;
	}

	public void setStatus(StatusOrdem status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItems() {
		return items;
	}
	
	public void adicionarItem(ItemPedido itempedido) {
		items.add(itempedido);
	}
	
	public void removeItem(ItemPedido itempedido) {
		items.remove(itempedido);
	}
	
	public Double total() {
		Double soma=0d;
		for (ItemPedido itemPedido : items) {
			soma+=itemPedido.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Data Do pedido: "+data);
		sb.append("\nstatus do pedido: "+ status);
		sb.append("\nCliente: "+cliente);
		sb.append("\nItems do Pedido: ");
		
		for (ItemPedido itemPedido : items) {
			sb.append("\nPedido: ");
			sb.append("\n"+itemPedido);
		}
		
		sb.append("\nValor Total do pedido: "+total());
		return sb.toString();
	}
	
	

	
	
	
	
	
	
}