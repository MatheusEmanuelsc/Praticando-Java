package praticando13.model.exception;

public class NaoPodedepositaOuRetirarMenorOuZeroValor extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NaoPodedepositaOuRetirarMenorOuZeroValor(String msg) {
		super(msg);
	}

}
