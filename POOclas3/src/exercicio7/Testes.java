package exercicio7;

import java.util.Random;

public class Testes {
	public static void main(String[] args) {
		Random rand = new Random();
		//loop usando a classe Random para gerar um codigo do tipo SerieLimitada
		//aleatoriamente
		for(int i = 0; i<SerieLimitada.getMaxInstancias();i++) {
			SerieLimitada.proximoDigito(rand.nextInt(10));
		}
		System.out.println("O numero de Serie gerado foi: "+SerieLimitada.String());
		SerieLimitada.imprimir();
		
		
	}
}
