package exercicio2;

public class Gabarito {
	private String[] respostas = new String[15];
	
	public Gabarito(String[] respostas) {
		this.respostas = respostas;
	}

	public String respostaQuestao(int numQuestao) {
		return respostas[numQuestao-1];
	}

	

}