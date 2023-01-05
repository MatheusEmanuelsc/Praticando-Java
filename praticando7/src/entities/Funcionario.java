package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.nivelFuncionario;

public class Funcionario {

	private String nomeFuncionaro;
	private nivelFuncionario nivel;
	private Double salarioBase;
	private Departamento departamento;

	private List<ContratosHora> listaDeContratos = new ArrayList<>();

	public Funcionario(String nomeFuncionaro, nivelFuncionario nivel, Double salarioBase, Departamento departamento) {

		this.nomeFuncionaro = nomeFuncionaro;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNomeFuncionaro() {
		return nomeFuncionaro;
	}

	public void setNomeFuncionaro(String nomeFuncionaro) {
		this.nomeFuncionaro = nomeFuncionaro;
	}

	public nivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(nivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratosHora> getListaDeContratos() {
		return listaDeContratos;
	}

	public void adicionarContratos(ContratosHora contrato) {
		listaDeContratos.add(contrato);
	}

	public void removeContratos(ContratosHora contrato) {
		listaDeContratos.remove(contrato);
	}

	public Double rendaMes(LocalDate data) {
		Double  renda = getSalarioBase();
		LocalDate dataVerificar = data;
		for (ContratosHora contratosHora : listaDeContratos) {
			
			Boolean mesIgual = contratosHora.getDataContrato().getMonth() == dataVerificar.getMonth();
			Boolean anoIgual = contratosHora.getDataContrato().getYear() == dataVerificar.getYear();

			if (mesIgual && anoIgual) {

				 renda = renda + contratosHora.valorContrato() ;

				

			}
		}
		return renda;

	}

	@Override
	public String toString() {
		return "Funcionario [nomeFuncionaro=" + nomeFuncionaro + ", nivel=" + nivel + ", salarioBase=" + salarioBase
				+ ", departamento=" + departamento + ", listaDeContratos=" + listaDeContratos + "]";
	}

}
