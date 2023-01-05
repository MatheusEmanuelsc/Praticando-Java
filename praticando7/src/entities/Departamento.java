package entities;

public class Departamento {

	private String nomeDepartamento;

	public Departamento() {

	}

	public Departamento(String nomeDepartamento) {

		this.nomeDepartamento = nomeDepartamento;
	}

	public String getnomeDepartamento() {
		return nomeDepartamento;
	}

	public void setnomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	@Override
	public String toString() {
		return "Departamento [nomeDepartamento=" + nomeDepartamento + "]";
	}

}
