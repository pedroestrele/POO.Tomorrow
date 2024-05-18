package exercicio3;

public class Critica {
	private double avaliacao;
	private String comentario;
	
	public Critica(int avaliacao,String comentario, Filme filme){
		this.avaliacao=avaliacao;
		this.comentario=comentario;
		filme.addCritica(this);
		
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	
}
