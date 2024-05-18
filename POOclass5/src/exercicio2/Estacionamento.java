package exercicio2;

public class Estacionamento {
	private double vagasDisp;//1 vaga de carro/caminhão = 1 vaga disp=2 vagas moto
	private double custoHora;//o custo/hora padrão(sem lucro)
	private double lucro=0;
	private int veiculosEstacionados;
	
	public Estacionamento(int vagasTotais, double custoHora) {
		this.vagasDisp = vagasTotais;
		this.custoHora = custoHora;
		veiculosEstacionados = 0;
	}
	
	public boolean estacionando(double tamanho) {
		if(vagasDisp>=tamanho) {
			vagasDisp-=tamanho;
			veiculosEstacionados++;
			return true;//estacionado = true
		}
		return false;//estacionado = false
		
	}
	//recebe o tempo vezes o preço hora de um veiculo
	public void pagamento(double preçoHora,double horas) {
		preçoHora = preçoHora-custoHora;//lucro do preçoHora
		//soma o lucro do total de horas que o veiculo ficou estacionado
		//as novas cobranças são feitas apenas de hora em hora
		lucro+=preçoHora*(int)horas;
	}
	
	public int getEstacionados() {
		return veiculosEstacionados;
	}
	
	public double getVagas(){
		return vagasDisp;
	}
	public double getCusto() {
		return custoHora;
	}
	
	public double lucro() {
		return lucro;
	}
}
