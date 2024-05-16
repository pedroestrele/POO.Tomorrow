package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] respostas = new String[15];
		//gabarito
		for(int i=0;i<15;i++) {
			respostas[i] = input.next(); 
		}
		Gabarito gabarito = new Gabarito(respostas);
		//aluno 1
		String[] respostaDoAluno = new String[15];
		Prova prova = new Prova(gabarito);
		for(int i=0;i<15;i++) {
			respostaDoAluno[i] = input.next(); 
			prova.respostaAluno(respostaDoAluno[i]);
		}
		//outro aluno
		String[] respostaDoAluno2 = new String[15];
		Prova outraProva = new Prova(gabarito);
		for(int i=0;i<15;i++) {
			respostaDoAluno2[i] = input.next(); 
			outraProva.respostaAluno(respostaDoAluno2[i]);
		}
		input.close();
		//output
		outraProva.getrespostas();
		System.out.println("o aluno 1 teve: "+prova.acertos()+" acertos"
				+ " e a sua nota foi "+prova.nota());
		System.out.println("o aluno 2 teve: "+outraProva.acertos()+" acertos"
				+ " e sua nota foi "+outraProva.nota());
		System.out.println("a prova com mais acertos teve nota: "
				+ ""+prova.maior(outraProva));
		
	}
}
