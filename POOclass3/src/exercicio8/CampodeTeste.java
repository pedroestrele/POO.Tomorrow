package exercicio8;

import java.util.Scanner;

public class CampodeTeste {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o numero do mes desejado");
		int x = input.nextInt();
		Meses mes = Meses.getMes(x);
		String evento = "Aniversário de fulano";
		Compromisso.registrarCompromisso(mes,evento);//registrando aniversario de fulano
		input.close();
		//registrando outros compromissos
		Compromisso.registrarCompromisso(Meses.MAIO, "dia das mães");
		Compromisso.registrarCompromisso(Meses.JUNHO,"São João");
		Compromisso.registrarCompromisso(Meses.AGOSTO,"dia do folclore");
		Compromisso.registrarCompromisso(Meses.OUTUBRO,"dia das crianças");
		Compromisso.registrarCompromisso(Meses.DEZEMBRO,"Natal");
	}
}
