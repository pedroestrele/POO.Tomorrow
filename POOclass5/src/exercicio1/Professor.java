package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Professor {
	private String nome;
	//lista com todas as disciplinas ministradas pelo professor
	private Set<Disciplina> disciplinasMinistradas = new HashSet<>();
	private double cargaHoraria;
	//lista com todos os professores registrados no sistema
	private static Set<Professor> professores = new HashSet<>();
	
	//construtor de professor dado seu nome, quantas disciplinas ministra e sua carga horaria
	public Professor(String nome, double cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria=cargaHoraria;
	}
	
	public void setDisciplina(Disciplina disciplina) {
//		//checa se tem conflito de horarios com a nova turma e as já adicionadas
//		if(Disciplina.checkHorario(this,disciplina)==null){
//			System.out.println("conflito de horarios");
//		}else{
		//caso não aja conflito adiciona a disciplina a lista do professor
		disciplinasMinistradas.add(disciplina);
//		}
	}
	
	public Disciplina getDisciplina(String disciplina) {
		for(Disciplina procurada:disciplinasMinistradas) {
			if(procurada.getDisciplina()==disciplina) {
				return procurada;//disciplina é ministrada pelo professor e retornada
			}
		}
		return null;//se o professor não ministra aquela disciplina
	}

	public String getNome() {
		return nome;
	}
	//adiciona horas a carga horaria do professor
	public void addCargaHoraria(double horas) {
		cargaHoraria+=horas;
	}
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public static Professor getProfessor(String nome) {
		for(Professor procurado:professores) {
			if(procurado.getNome()==nome) {
				return procurado;
			}
		}
		return null; 
	}
	
	public Set<Disciplina> getDisciplinasMinistradas(){
		return disciplinasMinistradas;
	}
	

}
