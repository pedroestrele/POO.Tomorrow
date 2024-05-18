package exercicio1;

public class Disciplina {
	private String materia;
	private Turma turma;
	private String horario;
	//construtor da classe disciplina definindo a turma, o horario e a materia
	public Disciplina(String materia,Turma turma, String horario) {
		this.materia = materia;
		this.turma = turma;
		//adiciona a disciplina a lista de disciplinas da turma
		turma.adicionarDisciplina(this);
		this.horario = horario;
	}
	
	
	public String getDisciplina() {
		return materia;
	}

	public Turma getTurma() {
		return turma;
	}
	
	public String getHorario() {
		return horario;
	}
	//checa se o horario da materia coincide com algum da turma
//	public static String checkHorario(Turma turma, Disciplina disciplina) {
//		for (Disciplina teste:turma.getDisciplinas()) {
//			if(teste.horario.equals(disciplina.horario)) {
//				return null;
//			}
//		}
//		return disciplina.horario;
//	}
//	public static String checkHorario(Professor professor, Disciplina disciplina) {
//		for (Disciplina teste:professor.getDisciplinasMinistradas()) {
//			if(teste.horario.equals(disciplina.horario)) {
//				return null;
//			}
//		}
//		return disciplina.horario;
//	}	
	//não funcionou ;-; 
}
