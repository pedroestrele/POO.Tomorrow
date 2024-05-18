package exercicio2;

public class Moto extends Veiculos{{
	tamanho = 0.5;
	//os estacionamentos lucram 40% em cima das motos(já que elas ocupam metade do espaço)
	//precoHora = estacionamento.getCusto()*1.2; da moto
	
}

	@Override
	void setPrecoHora() {
		precoHora = estacionamento.getCusto()*1.2;
	}
	@Override
	double getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

}
