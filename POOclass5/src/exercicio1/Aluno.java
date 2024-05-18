package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
	private String nome;
	private int idade;
	private Set<Nota> notas = new HashSet<>();//notas do aluno
	private boolean aprovado=true;
	
	private static Set<Aluno> alunos = new HashSet<>();//lista com todos os alunos
	
	//construtor de aluno para criar um aluno dado o seu nome, idade e sua turma 
	public Aluno(String nome,int idade,Turma turma) {
		this.nome = nome;
		this.idade = idade;
		turma.adicionarAluno(this);
	}
	
	public Set<Nota> alunoNotas() {
		return notas;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public boolean aprovado() {
		return aprovado;
	}
	
	public void reprovado() {
		aprovado = false;
	}
	
	//metodo para achar um aluno a partir do seu nome
		public static Aluno getAluno(String nome) {
			for(Aluno procurado:alunos) {
				if(procurado.getNome()==nome) {
					return procurado;
				}
			}
			return null; 
		}

}
