package exercicio2;

public class Carro extends Veiculos {{
	tamanho = 1;
	//os estacionamentos lucram 30% em cima dos carros
	//precoHora = estacionamento.getCusto()*1.3; do carro
	}
	
	
	@Override
	void setPrecoHora() {
		precoHora = estacionamento.getCusto()*1.3;
	}

	@Override
	public double getSize() {
		return tamanho;
	}

	@Override
	public double getPreco() {
		return precoHora;
	}

	

}

	

