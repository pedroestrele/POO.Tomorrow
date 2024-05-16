package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Nota {
	private Aluno aluno;
	private Turma turma;
	private int nota;
	//lista com todas as notas registradas
	static Set<Nota> notasRegistradas = new HashSet<>();
	//registro de uma nota
	public Nota(Aluno aluno,Turma turma, int nota) {
		this.aluno = aluno;
		this.nota = nota;
		this.turma = turma;
		notasRegistradas.add(this);
		
	}

	//metodos para resgatar as informações básicas da nota
	public int getNota() {
		return nota;
	}
	//metodo para imprimir nota de um aluno em certa turma
	public static void mostrarNota(Aluno aluno, Turma turma) {
		for(Nota verifica:Nota.notasRegistradas) {
			if(verifica.turma==turma&&verifica.aluno==aluno) {
				System.out.println("A nota do aluno foi: "+verifica.nota);
			}
		}
		
		
	}
	
}
