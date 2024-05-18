package exercicio2;

public class Caminhão extends Veiculos{{
	tamanho = 1;
	//os estacionamentos lucram 50% em cima dos caminhões
	//precoHora = estacionamento.getCusto()*1.5; dos caminhões
	}
	@Override
	void setPrecoHora() {
		precoHora = estacionamento.getCusto()*1.5;
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

