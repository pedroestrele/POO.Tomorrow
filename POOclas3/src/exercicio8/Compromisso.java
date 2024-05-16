package exercicio8;

public class Compromisso {
	private Meses mes;
	private String descricao;
	//construtor da classe
	private Compromisso(Meses mes,String evento) {
		this.mes=mes;
		this.descricao=evento;
		
	}
	//metodo para retornar as variaveis de um objeto da classe
	public Meses getMes() {
		return mes;
	}
	public String getDescricao() {
		return descricao;
	}
	//metodo para registrar uma compromisso e imprimi-lo na tela
	public static void registrarCompromisso(Meses mes,String evento) {
		Compromisso compromisso = new Compromisso(mes,evento);
		System.out.println(compromisso);
	}
	//toString
	@Override
	public String toString() {

		return "em "+mes.getDescricao()
				+ " está marcado o "+this.getDescricao();
	}
	
	
}
