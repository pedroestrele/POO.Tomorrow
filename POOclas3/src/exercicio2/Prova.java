package exercicio2;

import java.util.Arrays;

public class Prova {
	private int questoesCorrigidas=0;
	private String[] gabaritoDoAluno= new String[15];
	private Gabarito gabarito;
	
	public Prova(Gabarito gabarito) {
		this.gabarito = gabarito;
	}
	
	public void getrespostas() {
		System.out.println(Arrays.toString(gabaritoDoAluno));
	}
	
	public void respostaAluno(String resposta) {
		if(questoesCorrigidas<15) {
		gabaritoDoAluno[questoesCorrigidas]=resposta;
		}
		questoesCorrigidas++;
	}
	public int acertos() {
		int acertos = 0;
		for(int i=0;i<15;i++) {
			if(gabarito.respostaQuestao(i+1).equals(gabaritoDoAluno[i])) {
				acertos++;
			}
		}
		return acertos;
	}
	
	public double nota() {
		double nota=0;
		for(int i=0;i<15;i++) {
			if(gabarito.respostaQuestao(i+1).equals(gabaritoDoAluno[i])){
				if(i<10) {
					nota+=0.5;
				}else {
					nota+=1;
				}
		
			}
		}
		return nota;
	}
	
	public double maior(Prova comparada) {
		if(this.acertos()>comparada.acertos()) {
			return this.nota();
		}else if(this.acertos()<comparada.acertos()){
			return comparada.nota();
		}else {
			if(this.nota()>=comparada.nota()) {
				return this.nota();
			}else {
				return comparada.nota();
			}
		}
	}
	
	
}
