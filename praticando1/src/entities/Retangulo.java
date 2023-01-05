package entities;

public class Retangulo {

	private double largura;
	private double altura;
	
	
	
	
	
	public Retangulo(double largura, double altura) {
		
		this.largura = largura;
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public  double  area() {
		return this.altura*this.largura;
	}
	
	

	@Override
	public String toString() {
		return "Retangulo largura=" + largura + ", altura=" + altura +
				 " area = "+ area();

	}
	
	
	
	
	
	
}
