package entities;

import java.time.LocalDate;



public class ContratosHora {

	private LocalDate dataContrato;
	private Double valorHora;
	private Integer horas;
	
	
	public ContratosHora(LocalDate dataContrato, Double valorHora, Integer horas) {
		this.dataContrato = dataContrato;
		this.valorHora = valorHora;
		this.horas = horas;
	}


	public LocalDate getDataContrato() {
		return dataContrato;
	}


	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}


	public Double getValorHora() {
		return valorHora;
	}


	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}


	public Integer getHoras() {
		return horas;
	}


	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public  double valorContrato() {
		return getHoras()*getValorHora();
	}
	
	
	
	
	
	
}
