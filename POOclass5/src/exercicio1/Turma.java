package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Turma {
	private int numDaTurma;//numero da turma
	private Set<Aluno> alunosDaTurma = new HashSet<>();//lista com os alunos da turma
	//lista com as disciplinas que a turma frequenta
	private Set<Disciplina> disciplinasDaTurma = new HashSet<>();
	//lista com todas as turmas registradas
	private static Set<Turma> turmas = new HashSet<>();
	
	
	public Turma(int numDaTurma) {
		
		this.numDaTurma = numDaTurma;
		turmas.add(this);
	}
	
	//metodo para adicionar um aluno a uma turma
	public void adicionarAluno(Aluno aluno) {
		alunosDaTurma.add(aluno);
	}
	//adiciona uma disciplina
	public void adicionarDisciplina(Disciplina disciplina) {
//		//checa se tem conflito de horarios com a nova turma e as já adicionadas
//		if(Disciplina.checkHorario(this,disciplina)==null){
//			System.out.println("conflito de horarios");
//		}else{
			//caso não aja conflito adiciona a disciplina a lista da turma
			disciplinasDaTurma.add(disciplina);
//		}
	}
	

	public int getNumDaTurma() {
		return numDaTurma;
	}

	public void setNumDaTurma(int numDaTurma) {
		this.numDaTurma = numDaTurma;
	}

	public Set<Aluno> getAlunosDaTurma() {
		return alunosDaTurma;
	}
	//para encontrar a media das notas em certa disciplina
	public double mediaDasNotas(Disciplina disciplina) {
		double media = 0;
			for(Aluno testado:alunosDaTurma) {//percorre os alunos da turma
				Nota nota = Nota.getRegistro(testado, disciplina);
				if(nota.equals(null)) {
					media+=0;//se o aluno NÃO fez a prova adiciona 0 a variavel
				}else {
					media+=nota.getNota();//adiciona a nota do aluno a variavel
				}
			}
		
		return media/alunosDaTurma.size();//retorna a media
	}
	//lista os reprovados/aprovados em uma disciplina
	public void reprovadosEaprovados(Disciplina disciplina) {
		System.out.println("DESEMPENHO DA TURMA NA DISCIPLINA "+disciplina.getDisciplina());
		for(Aluno alunos: alunosDaTurma) {
			Nota nota = Nota.getRegistro(alunos, disciplina);
			if(nota == null) {
				System.out.println(alunos.getNome()+" não fez a prova");
			}else {
				if(nota.getNota()>=5) {
					System.out.println(alunos.getNome()+" || APROVADO");
				}else {
					System.out.println(alunos.getNome()+" || REPROVADO");
				}
			}
		}	
	}
	//lista os horarios de aula da turma 
		public void listHorario() {
			for(Disciplina disciplina: disciplinasDaTurma) {
				System.out.println(disciplina.getDisciplina()+":"+disciplina.getHorario());
			}
		}
		//retorna as informações gerais da turma
		public void getInfo() {
			System.out.println("turma "+numDaTurma+":");
			System.out.println("quantidade de alunos: "+alunosDaTurma.size());
			System.out.println("quantidade de disciplinas: "+disciplinasDaTurma.size());
			aprovacoes();//processa os alunos que foram aprovados/reprovados
			System.out.println("alunos aprovados/reprovados: ");
			for(Aluno alunos: alunosDaTurma) {
				if(alunos.aprovado()) {
					System.out.println(alunos.getNome()+" || APROVADO");
				}else {
					System.out.println(alunos.getNome()+" || REPROVADO");
				}
			}
		}
		
		//metodo que reprova alunos com notas inferiores a 5
		public void aprovacoes() {
			for(Disciplina disciplina: disciplinasDaTurma) {
				for(Aluno alunos: alunosDaTurma) {
					Nota nota = Nota.getRegistro(alunos, disciplina);
					if (nota == null) {//evitando bugs 
					}else if(nota.getNota()<5) {
						alunos.reprovado();//se um aluno tira menos de 5 ele é reprovado
					}
				}
			}
		}

	//metodo para achar uma turma a partir do seu numero
	public static Turma getTurma(int numDaTurma) {
		for(Turma procurada:turmas) {
			if(procurada.getNumDaTurma()==numDaTurma) {
				return procurada;
			}
		}
		return null; 
	}
	public static Set<Turma> getTurmas(){
		return turmas;
	}
	
	public Set<Disciplina> getDisciplinas() {
		return disciplinasDaTurma;
	}

	public void setAlunosDaTurma(Set<Aluno> alunosDaTurma) {
		this.alunosDaTurma = alunosDaTurma;
	}
	
	
}
