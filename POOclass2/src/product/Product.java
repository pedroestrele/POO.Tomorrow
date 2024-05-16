package product;
import bank.ContaBancaria;
public class Product {
	private String nome;
	private float preco;
	private int estoque;

	//construtores
	public Product(String nome,float preco) {
		this.nome = nome;
		this.preco = preco;
		estoque = 0;
	}
	public Product(String nome, float preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	//metodo para listar informações de um determinado produto
	public void getInfo() {
		System.out.println("Produto: "+nome);
		System.out.println("Custa: "+preco);
		System.out.println("em Estoque tem mais "+estoque);
	}
	//metodo para chamar a quantidade de produtos x em estoque
	public int emEstoque() {
		return estoque;
	}
	//metodos relacionados a quantidade de produtos em estoque
	//1- vender x produtos = diminuir quantidade x do estoque
	public int vender(int vendidos) {//retorna a quantidade vendida
		if(estoque>=vendidos) {
			estoque-=vendidos;
			return vendidos;
		}else if(estoque>0) {
			System.out.println("temos apenas mais "+estoque
					+" produto(s) em estoque");
			vendidos = estoque;
			estoque = 0;
			return vendidos;
		}else {
			System.out.println("desculpe, não temos mais produtos do tipo"
					+ ""+nome);
			return 0;
		}
	}
	//2- comprar produtos = aumentar quantidade x em estoque
	//metodo sem usar ContaBancaria
	public void comprar(int comprados) {
		estoque+=comprados;
		System.out.println("foram comprados "+comprados+" produtos "+this.nome);
	}
	//metodo usando ContaBancaria
	//retorna a quantidade de produtos comprados com sucesso
	public int comprar(int comprados,ContaBancaria loja) {
		//caso a loja tenha saldo pra comprar a quantidade desejada
		if(loja.getSaldo()>=comprados*preco) {
			estoque+=comprados;
			return comprados;
		//caso a loja NÃO tenha saldo suficiente para comprar o produto
		}else if(loja.getSaldo()<preco) {
			System.out.println("não foi possível comprar o produto");
			return 0;
		// caso a loja tenha saldo para comprar pelo menos 1 produto
		// mas não a quantidade desejada
		}else {
			comprados = 0;
			for(int i=1;loja.getSaldo()>=i*preco;i++) {
				comprados++;
			}
			System.out.println("o saldo permitiu a compra de "
					+ "apenas mais "+comprados+" produtos");
			estoque+=comprados;
			return comprados;
		}
		
		
	}
	
		
}
