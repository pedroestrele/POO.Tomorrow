package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class DiaAula {
	private String dataHora;
	private Turma turma;
	private String conteudo;
	//lista com todos os dias-aula
	private static Set<DiaAula> diasAulaRegistrados = new HashSet<>();
	//registro de um dia-aula
	public DiaAula(Turma turma,String dataHora, String conteudo) {
		this.turma=turma;
		this.dataHora=dataHora;
		this.conteudo=conteudo;
		//adiciona a lista dos dias-aula
		diasAulaRegistrados.add(this);
	}

	//metodos para resgatar as informações básicas do dia-aula
	public Turma getTurma() {
		return turma;
	}
	public String getDataHora() {
		return dataHora;
	}
	public String getConteudo() {
		return conteudo;
	}
	
	//metodo que lista os alunos presentes em um dia-aula
	public static void showPresentes(DiaAula diaAula) {
		System.out.println("Estavam presentes na aula de "+diaAula.dataHora+":");
		for(Frequencia f:Frequencia.frequenciasRegistradas) {
			//verifica o dia aula registrado na frequencia
			if(f.getDiaAula()==diaAula) {
				System.out.print(f.getAluno().getNome()+", ");
			}
		}
		System.out.println("apenas.");
	}
	//metodo para encontrar um dia-aula registrado no sistema a partir de uma data/hora
	//e turma 
	public static DiaAula encontrarDiaAula(String dataAula, Turma turma) {
		DiaAula diaAula=null;
		for(DiaAula procurado:diasAulaRegistrados) {
			if(procurado.getDataHora().equals(dataAula)&&procurado.getTurma()==turma) {
				diaAula = procurado;
				return diaAula;
			}
		}
		return diaAula;
	}
}
