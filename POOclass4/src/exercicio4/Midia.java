package exercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public abstract class Midia {
	int codigo;
	double preco;
	String nome;
	//lista com todos os discos/midias registradas(FORA DE ORDEM)
	static Set<Midia> discos = new HashSet<>();
	
	protected Midia() {//construtor vazio para uso do inserirDados
		
	}
	//construtor da classe abstrata Midia com codigo, preço e nome da midia
	protected Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
		
	}
	
	abstract String getTipo();//retorna o tipo da midia
	abstract String getDetalhes();//retorna os detalhes do disco
	
	public void printDados() {//imprime na tela os detalhes e o tipo da midia
		System.out.println(getDetalhes());
		System.out.println(getTipo());
	}
	protected void inserirDados(Scanner input) {//metodo para definir os dados da midia
		System.out.println("insira o nome do disco");
		String nome = input.nextLine();
		this.nome = nome;
		System.out.println("insira o codigo do disco");
		int codigo = input.nextInt();
		this.codigo = codigo;
		System.out.println("insira o preço do disco");
		double preco = input.nextDouble();
		this.preco = preco;
		input.nextLine();//para pular quebra de linha
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	public String getNome() {
		return nome;
	}

	


	
}
