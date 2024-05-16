package exercicio1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Aluno {
	private String nome;
	private String matricula;
	private String dataNascimento;
	//lista dos alunos matriculados
	static Set<Aluno> alunos = new HashSet<>();
	//lista das matriculas registradas
	static Set<String> matriculasRegistradas = new HashSet<>();
	
	
	Random rand = new Random();
	//caso de registro de um aluno informando a matricula
	public Aluno(String nome,int matricula, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula+"";
		//se a matricula informada já estiver cadastrada 
		//e as outras informações diferirem das do aluno com tal matricula
		//uma matricula diferente é gerada aleatóriamente 
		//se as informações coincidirem o aluno já está registrado
		while(!alunos.contains(this) && matriculasRegistradas.contains(matricula+"")){
			
			this.matricula="";
			for(int i=0;i<9;i++) {
					this.matricula+=rand.nextInt(10);
			}
			
		}
		//adicionando ao sistema
		alunos.add(this);
		matriculasRegistradas.add(this.matricula);
	}
	//registro de um aluno sem se importar com o cadastro da matrícula
	public Aluno(String nome, String dataNascimento) {
		this.nome=nome;
		this.dataNascimento=dataNascimento;
		//gerando uma matricula, de forma aleatória, diferente das registradas 
		do {
			this.matricula="";
			for(int i=0;i<9;i++) {
			this.matricula+=rand.nextInt(10);
			
			}
		}while(matriculasRegistradas.contains(this.matricula));
		//adicionando ao sistema
		matriculasRegistradas.add(this.matricula);
		alunos.add(this);

	}
	//metodos para resgatar as informações básicas do aluno
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public void getInfo() {
		System.out.println("Aluno(a) "+nome+" nascido(a) em : "+dataNascimento);
		System.out.println("de Matrícula: "+matricula);
	}
	//metodo para buscar um aluno no sistema a partir do seu nº de matricula
	public static Aluno procuraAluno(String matriculaDoAluno) {
		Aluno aluno = null;
		for(Aluno procurado:Aluno.alunos) {
			if(procurado.getMatricula().equals(matriculaDoAluno)) {
				aluno = procurado;
				return aluno;
			}

		}

		return aluno;
	}
	
}