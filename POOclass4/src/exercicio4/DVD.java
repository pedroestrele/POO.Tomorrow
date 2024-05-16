package exercicio4;

import java.util.Scanner;

public class DVD extends Midia {
	private int numFaixas;
	
	public DVD(){
		
	}
	//construtor de DVD com codigo, preço, nome, e numero de faixas do disco
	public DVD(int code, double preco, String nome, int numFaixas) {
		super(code,preco,nome);
		this.numFaixas = numFaixas;
	}
	@Override
	protected String getTipo() {//retorna o tipo do disco como DVD em String
		return "DVD";
	}

	@Override
	protected String getDetalhes() {//retorna detalhes sobre o DVD
		String detalhes = "O DVD "+nome+" de código "+codigo+" tem "+numFaixas+" faixas e custa "+preco;
		return detalhes;
	}

	public int getNumFaixas() {//retorna o numero de faixas do DVD
		return numFaixas;
	}
	public void setNumFaixas(int numFaixas) {// define o numero de faixas do DVD
		this.numFaixas = numFaixas;
	}
	@Override
	public void inserirDados(Scanner input) {//inserção de dados para definir variaveis
		super.inserirDados(input);
		System.out.println("insira o numero de faixas do DVD");
		int numFaixas = input.nextInt();
		this.numFaixas = numFaixas;
		input.nextLine();//para pular quebra de linha
		discos.add(this);
		
	}

}
