package exercicio4;

import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner input = new Scanner(System.in);
		System.out.println("informe o nome do produto:");
		String nome = input.nextLine();
		produto.setNome(nome);
		System.out.println("informe o preço de compra do produto: ");
		double precoCompra = input.nextDouble();
		produto.setPrecoCompra(precoCompra);
		System.out.println("informe o preço de venda do produto: ");
		double precoVenda;	
		do {
			precoVenda = input.nextDouble();
			produto.setPrecoVenda(precoVenda);
			
		}while(precoVenda<precoCompra);
		input.close();
		produto.CalcularMargemLucro();
		System.out.println("o lucro será de : "+produto.getMargemLucro()+"R$");
		System.out.println("tendo assim "+produto.getMargemLucroPorcentagem()+" de lucro");
		
	}
	

}
