package entities;

public class Funcionario {

	private String name;
	private double salarioBruto;
	private double imposto;
	
	
	public Funcionario(String name, double salarioBruto, double imposto) {
		
		this.name = name;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
	public double salarioLiquido() {
		return getSalarioBruto()-getImposto();
	}

	public double salarioComBonus(double porcetagem) {
		double bonus = getSalarioBruto()*porcetagem/100;
		 return getSalarioBruto()+bonus;
	}
	@Override
	public String toString() {
		return "Funcionario [name=" +getName() + ", salarioBruto=" + getSalarioBruto() + ", imposto=" + getImposto() + "]";
	}
	
	
	
	
	
}
