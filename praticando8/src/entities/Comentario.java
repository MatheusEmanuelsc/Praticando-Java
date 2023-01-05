package entities;

public class Comentario {

	private String comentatario;

	public Comentario(String comentatario) {
		
		this.comentatario = comentatario;
	}

	public String getComentatario() {
		return comentatario;
	}

	public void setComentatario(String comentatario) {
		this.comentatario = comentatario;
	}

	@Override
	public String toString() {
		return "Comentario [comentatario=" + comentatario + "]";
	}
	
	
	
}
