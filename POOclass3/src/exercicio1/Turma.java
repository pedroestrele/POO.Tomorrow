package exercicio1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Turma {
	private String codigo;
	private String disciplina;
	//lista com todos os codigos das turmas
	private static Set<String> codigosDasTurmas = new HashSet<>();
	//lista com todas as turmas criadas
	private static Set<Turma> turmasCriadas = new HashSet<>(); 
	//lista com os alunos inscritos na turma
	Set<Aluno> alunosInscritos = new HashSet<>();
	
	Random rand = new Random();
	//construtor da classe: informe a disciplina e o maximo de alunos
	//a se increver na turma
	public Turma(String disciplina) {
		this.disciplina = disciplina;
		String codigo="";
		do{// gerando aleatoriamente o codigo para a disciplina 
			for(int i=0; i<6;i++) {
				codigo+=rand.nextInt(10);
			}
			this.codigo=codigo;
		}while(codigosDasTurmas.contains(this.codigo));//evitando repetição
		//adicionando a lista
		codigosDasTurmas.add(this.codigo);
		turmasCriadas.add(this);
	}
	
	//metodos para resgatar as informações básicas da turma
	public String getDisciplina() {
		return disciplina;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getInfo() {
		String info = disciplina+" "+codigo;
		return info;
	}
	
	//metodo para listar todas as turmas já registradas
	public static void listaDasTurmas() {
		for(Turma essa:Turma.turmasCriadas) {
			System.out.print(essa.getInfo()+", ");
		}
	}
	
	//metodo para inscrever aluno em uma turma
	public void inscreverAluno(Aluno aluno) {
			alunosInscritos.add(aluno);
			System.out.println("inscrição feita com sucesso");
	}
	//metodo para listar os alunos inscritos na turma
	public void inscritosNaTurma() {
		System.out.println("São :");
		for(Aluno aluno:this.alunosInscritos) {
			System.out.print(aluno.getNome()+", ");
		}
		System.out.println("os alunos inscritos na turma.");
	}

	//metodo para listar as presenças e faltas dos alunos inscritos na turma
	public void listarFrequenciasDaTurma() {
		System.out.println("listando presenças da turma:");
		for(Aluno alunos:this.alunosInscritos) {
			Frequencia.quantasPresencas(alunos, this);
		}
	}
	//metodo para listar as notas dos alunos inscritos na turma
	public void listarNotasDaTurma() {
		System.out.println("listando notas da turma: ");
		for(Aluno alunos:this.alunosInscritos) {
			Nota.mostrarNota(alunos,this);
		}
	}
	//metodo para encontrar uma turma no sistema a partir do codigo dessa
	public static Turma encontrarTurma(String codigo) {
		Turma turma;
		for(Turma procurado:Turma.turmasCriadas) {
			if(procurado.getCodigo().equals(codigo)) {
				turma = procurado;
				return turma;
			}
		}
		turma = null;
		return turma;
	}
	
}
