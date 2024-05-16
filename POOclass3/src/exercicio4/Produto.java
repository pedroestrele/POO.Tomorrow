package exercicio4;

import java.text.DecimalFormat;

public class Produto {
	private String nome;
	private double precoVenda;
	private double precoCompra;
	private double margemLucro;
	DecimalFormat format = new DecimalFormat("0.00");
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPrecoVenda(double precoVenda) {
		if(precoVenda>=precoCompra) {
			this.precoVenda=precoVenda;
		}else {
			System.out.println("o preço de venda deve ser maior que o preço de compra");
		}
		
	}
	
	public void setPrecoCompra(double precoCompra) {
			this.precoCompra=precoCompra;
	}
	
	public void CalcularMargemLucro() {
		margemLucro=precoVenda-precoCompra;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPrecoCompra() {
		return precoCompra;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public String getMargemLucro() {
		return format.format(margemLucro);
	}
	public String getMargemLucroPorcentagem() {
		double porcentagemdecimal=margemLucro/precoCompra;
		double porcentagem = porcentagemdecimal*100;
		return format.format(porcentagem)+"%";
	}
	
	
	

}
