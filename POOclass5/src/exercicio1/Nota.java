package exercicio1;

import java.util.HashSet;
import java.util.Set;
//classe que representa o registro da nota escolar de um certo aluno em uma certa 
//disciplina
public class Nota {
	private Aluno aluno;
	private Disciplina disciplina;
	private double nota;
	
	private static Set<Nota> notasRegistradas = new HashSet<>();//todas as notas registradas
	
	//construtor com uma nota 
	public Nota(Aluno aluno, Disciplina disciplina, int nota) {
		this.aluno=aluno;
		this.disciplina=disciplina;
		this.nota=nota;
		aluno.alunoNotas().add(this);
		notasRegistradas.add(this);
	}
	
	public void getDescricao() {
		System.out.println("o aluno "+aluno.getNome()+" tirou "+nota+" "
				+ "em "+disciplina.getDisciplina());
	}
	
	
	//encontra um objeto nota a partir de um aluno e uma disciplina
	public static Nota getRegistro(Aluno aluno, Disciplina disciplina) {
		for(Nota procurada:notasRegistradas) {
			if(procurada.aluno == aluno&&procurada.disciplina == disciplina) {
				return procurada;
			}
		}
		return null;//caso não tenha registro da nota
	}
	
	public double getNota() {
		return nota;
	}
}
