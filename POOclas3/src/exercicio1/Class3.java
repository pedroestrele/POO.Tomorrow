package exercicio1;

import java.util.Scanner;

public class Class3 {

	//metodo para listar as funções que o usuário terá acesso
	public static void listarFuncoes() {
		System.out.println("(1) Registrar um aluno.");
		System.out.println("(2) Registrar uma turma.");
		System.out.println("(3) Registrar um dia-aula.");
		System.out.println("(4) Registrar uma nota.");
		System.out.println("(5) Registrar uma frequência.");
		System.out.println("(6) Dado um dia aula e uma turma, identificar os alunos presentes.");
		System.out.println("(7) Dado um aluno e uma turma,"
				+ " mostrar a quantidade de presenças e de faltas.");
		System.out.println("(8) Dado um aluno e uma turma, mostrar sua nota.");
		System.out.println("(9) Listar os alunos inscritos em uma turma.");
		System.out.println("(10) Listar as turmas.");
		System.out.println("(11) Listar o total de faltas e presenças por aluno, para uma dada turma.");
		System.out.println("(12) Listar notas por aluno para uma dada turma.");
		System.out.println("(13) Sair do sistema.");
	}

	
	public static void main(String[] args) {
		Aluno aluno;
		Turma turma;
		DiaAula diaAula;
		Nota nota;

//		Aluno pedro = new Aluno("Pedro","02/01/2006");
//		Turma POO = new Turma("POO");
//		POO.inscreverAluno(Aluno.procuraAluno(pedro.getMatricula()));//funcionando
//		POO.inscritosNaTurma();
//		System.out.println(pedro.getMatricula());
		String option;
		Scanner enter = new Scanner(System.in);//scanner para o loop final
		Scanner input = new Scanner(System.in);//scanner principal para o programa
		do {
			listarFuncoes();
            option = input.nextLine();
            option = option.replaceAll("[^0-9]", "");
			switch(option) {
			case "1" :
				//registrar um aluno
				//informações do aluno
				System.out.println("escreva: nome do aluno");
				String nomeDoAluno = input.nextLine();
				System.out.println("escreva: data de nascimento");
				String dataDeNasc = input.nextLine();
				//registrando aluno
				aluno = new Aluno(nomeDoAluno,dataDeNasc);
				System.out.println(aluno.getMatricula()+" é o nº de matricula"
						+ " do novo aluno");//informando o nº de matricula do aluno
				break;
			case "2": 
				//registrar uma turma
				System.out.println("escreva: a disciplina da turma");
				String disciplina = input.nextLine();
				turma = new Turma(disciplina);
				//informando o codigo da turma criada
				System.out.println(turma.getCodigo()+" é o código da nova turma");
				break;
			case "3": 
				//registrar um dia-aula
				//coletando horario da aula+data
				System.out.println("Escreva: data e hora da aula");
				String dataHora = input.nextLine();
				//coletando o codigo da turma que teve a aula
				System.out.println("Escreva: o codigo da turma");
				String codigoDaTurma = input.nextLine();
				//encontrando a turma
				turma = Turma.encontrarTurma(codigoDaTurma);
				//coletando o conteudo dado na aula
				System.out.println("Escreva: conteúdo da aula");
				String conteudo = input.nextLine();
				//registrando o dia-aula
				diaAula = new DiaAula(turma, dataHora, conteudo);
				System.out.println("no dia "+diaAula.getDataHora()+" a turma"
						+ " "+codigoDaTurma+" deu o conteudo a seguir: "+conteudo);
				break;
			case "4":
				//registrar uma nota
				//encontrando o aluno
				System.out.println("escreva: a matricula do aluno");
				String matriculaDoAluno = input.nextLine();
				aluno = Aluno.procuraAluno(matriculaDoAluno);
				//encontrando a turma
				System.out.println("escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma);
				//coletando a nota que o aluno obteve naquela turma
				System.out.println("escreva: a nota do aluno");
				int notaInt = input.nextInt();
				//registrando nota
				nota = new Nota(aluno,turma,notaInt);	
				System.out.println("o aluno "+aluno.getNome()+" tirou"
						+ " "+nota.getNota()+" em "+turma.getDisciplina());
				break;
				
			case "5":
				//registrar uma frequencia
				//Achando aluno no sistema
			    System.out.println("Escreva: a matricula do aluno");
			    matriculaDoAluno = input.nextLine();
			    aluno = Aluno.procuraAluno(matriculaDoAluno);
			    //achando diaAula e a turma
			    System.out.println("Escreva: data e hora da aula");
			    String dataAula = input.nextLine();
			    System.out.println("Escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma);
				diaAula = DiaAula.encontrarDiaAula(dataAula,turma);
				//presença do aluno    
			    System.out.println("O aluno estava presente? (true/false)");
			    boolean presente = input.nextBoolean();
				//registrando frequencia    
			    Frequencia frequencia = new Frequencia(aluno, diaAula, presente);
			    frequencia.estavaPresente();
			    break;
			case "6":
				//dado um dia aula e uma turma identificar os alunos presentes
				//coletando a data/hora do dia-aula
				System.out.println("Escreva: data e hora da aula");
				dataAula = input.nextLine();
				//coletando o codigo da turma
				System.out.println("Escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();
				//encontrando a turma e o dia-aula
				turma = Turma.encontrarTurma(codigoDaTurma);
				diaAula = DiaAula.encontrarDiaAula(dataAula, turma);
				//imprimindo os presentes na tela
				DiaAula.showPresentes(diaAula);
				break;
				
			case "7":
				//dado um aluno e uma turma mostrar a quantidade de presenças e faltas
				//do aluno na turma dada
			    System.out.println("Escreva: a matricula do aluno");
			    matriculaDoAluno = input.nextLine();
			    aluno = Aluno.procuraAluno(matriculaDoAluno);
			    //achando turma
			    System.out.println("Escreva: o codigo da turma");
			    codigoDaTurma = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma);
				//imprimindo a quantidade de presenças e faltas do aluno na turma
				Frequencia.quantasPresencas(aluno, turma);
				break;
				
			case "8":
				//dado um aluno e uma turma mostrar sua nota
				//achando o aluno
			    System.out.println("Escreva: a matricula do aluno");
			    matriculaDoAluno = input.nextLine();
			    aluno = Aluno.procuraAluno(matriculaDoAluno);
			    //achando a turma
			    System.out.println("Escreva: o codigo da turma");
				String codigoDaTurma8 = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma8);
				//imprimindo a nota do aluno na turma
				Nota.mostrarNota(aluno, turma);
				break;
			    
				
			case "9":
				//listar os alunos inscritos em uma turma
				//achando a turma
			    System.out.println("Escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();

				codigoDaTurma = codigoDaTurma.replaceAll("[^0-9]", "");
				turma = Turma.encontrarTurma(codigoDaTurma);
				//listando alunos inscritos
				turma.inscritosNaTurma();
				break;
				
			case "10":
				//listar as turmas
				Turma.listaDasTurmas();
				break;
				
			case "11":
				//listar total de faltas e presenças por aluno para uma dada turma
				//achando a turma
			    System.out.println("Escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma);
				//listando as frequencias
				turma.listarFrequenciasDaTurma();
				break;
			case "12":
				//listar notas por aluno para dada turma
				//achando a turma
			    System.out.println("Escreva: o codigo da turma");
				codigoDaTurma = input.nextLine();
				turma = Turma.encontrarTurma(codigoDaTurma);
				//listando notas
				turma.listarNotasDaTurma();
				break;
			case "13":
				System.out.println("saindo do sistema");
				break;
			default:
				System.out.println("selecione algo válido");
				continue;
			
			}
			//se o sistema for continuar um loop é acionado até que o usuário pressione
			//'enter'(para que seja possivel a visualização da resposta final da opção)
			if(!option.equals("13")) {
			System.out.println("pressione 'enter' para continuar");
			String line = "";
				while(enter.hasNextLine()&&!line.isEmpty()){
				line = enter.nextLine();
				}
			}
		}while(!option.equals("13"));//se o usuário digitar a função 13 ele sai do sistema
		input.close();
		enter.close();
	}
	


}
