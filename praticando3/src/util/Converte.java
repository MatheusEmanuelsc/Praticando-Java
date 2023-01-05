package util;

public class Converte {

	public static double iof = 6;
	
	public static double converte(double dolarPreco , double dolarQuantidade) {
	double realBruto =	dolarPreco*dolarQuantidade;
	double realLiquido= realBruto-(realBruto*iof)/100;
		return  realLiquido;
	}
}

