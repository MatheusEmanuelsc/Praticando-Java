package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private  String titulo;
	private  String conteudo;
	private  Integer curtidas;
	private  Instant data;
	
	private List<Comentario> comentarios = new ArrayList<>();

	public Post(String titulo, String conteudo, Integer curtidas) {
		
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
		this.data = Instant.now();
	}
	
	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getConteudo() {
		return conteudo;
	}



	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}



	public Integer getCurtidas() {
		return curtidas;
	}



	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}



	public Instant getData() {
		return data;
	}







	public List<Comentario> getComentarios() {
		return comentarios;
	}



    public void adcionarComentarios(Comentario comentario) {
    	comentarios.add(comentario);
    }
    
    public void removeComentarios(Comentario comentario) {
    	comentarios.remove(comentario);
    }



	@Override
	public String toString() {
		LocalDateTime dataConvertida=  LocalDateTime.ofInstant(data, ZoneId.systemDefault());
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo: "+ getTitulo());
		sb.append("\nCurtidas: "+ getCurtidas());
		sb.append(" Data: "+dataConvertida);
		sb.append("\nComentarios: \n");
		
		for (Comentario comentario : comentarios) {
			
			sb.append(comentario.getComentatario()+"\n");
		}
				
		return sb.toString();
	}
	
	
	
	
	
}
