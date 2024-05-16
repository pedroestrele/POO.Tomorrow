package exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Frequencia {
	private Aluno aluno;
	private DiaAula diaAula;
	private boolean presente;
	public static Set<Frequencia> frequenciasRegistradas = new HashSet<>();
	
	//registro de uma frequencia 
	public Frequencia(Aluno aluno,DiaAula diaAula,boolean presente) {
		this.aluno=aluno;
		this.diaAula=diaAula;
		this.presente=presente;
		frequenciasRegistradas.add(this);
	}

	//metodo para saber se em uma frequencia o aluno estava presente ou ausente
	public void estavaPresente() {
		if(presente) {
			System.out.println(aluno.getNome()+" estava presente "+diaAula.getDataHora());
		}else {
			System.out.println(aluno.getNome()+" não estava presente "+diaAula.getDataHora());
		}
	}
	
	//metodos para resgatar as informações básicas da frequencia
	public boolean getPresenca() {
		return presente;
	}
	public DiaAula getDiaAula() {
		return diaAula;
	}
	public Aluno getAluno() {
		return aluno;
	}
	
	//listando quantas presenças e faltas um aluno tem
	static public void quantasPresencas(Aluno aluno, Turma turma) {
		int presencas = 0;
		int faltas = 0;
		//loop verifica cada frequencia registrada, compara o aluno e a turma com
		//os desejados e registra presenças++ ou faltas++ para cada frequencia
		for(Frequencia verifica:Frequencia.frequenciasRegistradas) {
			if(verifica.aluno==aluno&&verifica.diaAula.getTurma()==turma) {
					if(verifica.presente==true) {
						presencas++;
					}else if(verifica.presente==false) {
						faltas++;
					}
			}
		}
		//imprime as presenças e faltas numa String após o processo
		System.out.println(aluno.getNome()+" tem "+presencas+" presença(s)"
				+ " e "+faltas+" falta(s) na turma de "+turma.getDisciplina());
	}
	
	
	
}
