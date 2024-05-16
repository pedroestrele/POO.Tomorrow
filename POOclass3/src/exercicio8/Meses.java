package exercicio8;

public class Meses {
	String descricao;
	//construtor privado(evitando instancias diretas)
	private Meses(String descricao) {
		this.descricao=descricao;
	}
	//instancias de Meses
	final static Meses JANEIRO = new Meses("Janeiro");
	final static Meses FEVEREIRO = new Meses("Fevereiro");
	final static Meses MARCO = new Meses("Março");
	final static Meses ABRIL = new Meses("Abril");
	final static Meses MAIO = new Meses("Maio");
	final static Meses JUNHO = new Meses("Junho");
	final static Meses JULHO = new Meses("Julho");
	final static Meses AGOSTO = new Meses("Agosto");
	final static Meses SETEMBRO = new Meses("Setembro");
	final static Meses OUTUBRO = new Meses("Outubro");
	final static Meses NOVEMBRO = new Meses("Novembro");
	final static Meses DEZEMBRO = new Meses("Dezembro");
	//metodo para achar uma instancia de Meses a partir de numerais
	public static Meses getMes(int mes) {
		switch(mes) {
			case 1:
				return JANEIRO;
			case 2:
				return FEVEREIRO;
			case 3:
				return MARCO;
			case 4:
				return ABRIL;
			case 5:
				return MAIO;
			case 6:
				return JUNHO;
			case 7:
				return JULHO;
			case 8:
				return AGOSTO;
			case 9:
				return SETEMBRO;
			case 10:
				return OUTUBRO;
			case 11:
				return NOVEMBRO;
			case 12:
				return DEZEMBRO;
			default:
				return null;
		}
	}

	public String getDescricao() {
		return descricao;
	}
	
}
