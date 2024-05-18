package exercicio2;

public abstract class Veiculos {
	protected double tamanho;
	protected Estacionamento estacionamento;
	protected double horas;//quantas horas o veiculo ficou estacionado
	protected double precoHora;//preço/hora do estacionamento para aquele veiculo
	
	//metodo que estaciona um veiculo em um estacionamento
	public void estacionar(Estacionamento estacionamento) {
		if(this.estacionamento==null) {
			this.estacionamento = estacionamento;
			estacionamento.estacionando(tamanho);
			setPrecoHora();
		}else{
			System.out.println("Veículo já estacionado");
		}
		
	}
	abstract void setPrecoHora();//metodo pra redefinir o preço de acordo c/ o estacionamento
	//metodo para adicionar horas 'estacionadas'
	public void addHoras(double horas) {
		this.horas = horas;
	}

	//veiculo sai do estacionamento
	public void sair() {
		if(estacionamento!=null) {
			estacionamento.pagamento(precoHora,horas);
			this.estacionamento=null;
		}else {
			System.out.println("Veículo não estacionado");
		}
	}
	abstract double getSize();//retorna o valor de tamanho em nº de vagas
	abstract double getPreco();//retorna o preço do estacionamento
}
