package exercicio4;

import java.util.Scanner;

public class CD extends Midia {
	private int numMusicas;
	
	public CD() {
		
	}
	//construtor de CD com codigo, preço, nome, e numero de numero de musicas
	public CD(int code, double preco, String nome, int numMusicas) {
		super(code,preco,nome);
		this.numMusicas = numMusicas;
	}
	@Override
	protected String getTipo() {//retorna o tipo do disco CD em String

		return "CD";
	}
	@Override
	protected String getDetalhes() {//retorna detalhes sobre o CD
		String detalhes = "O CD "+nome+" de código "+codigo+" tem "+numMusicas+" musicas e custa "+preco;
		return detalhes;
	}
	@Override
	public void inserirDados(Scanner input) {//inserção de dados para definir variaveis
		super.inserirDados(input);
		System.out.println("insira o numero de musicas do CD");
		int numMusicas = input.nextInt();
		this.numMusicas = numMusicas;
		input.nextLine();//pular quebra de linha
		discos.add(this);
	}
	
	public void setNumMusicas(int numMusicas) {//define o numero de musicas do disco
		this.numMusicas = numMusicas;
	}
	public int getNumMusicas() {//retorna o numero de musicas do disco
		return numMusicas;
	}
	
}
