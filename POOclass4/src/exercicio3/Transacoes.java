package exercicio3;

public class Transacoes {
	private double flutuacaoSaldo;
	private String data;
	private String registro;//registra a transação com seu tipo a data e a flutuação do saldo
	
	public Transacoes(double flutuacao, String data,String tipo) {
		this.flutuacaoSaldo=flutuacao;
		this.data=data;
		switch(tipo) {//define o tipo de transacao que foi efetuada
			case "deposito":
				registro = this.data+" foi depositado "+flutuacaoSaldo;
			case "saque":
				registro = this.data+" foi sacado "+flutuacaoSaldo;
			case "rendimento":
				registro = "em "+this.data+" seus rendimentos foram de "+flutuacaoSaldo; 
		}
	}
	//retorna a data da transação
	public String getData() {
		return data;
	}//retorna o registro da transação
	public String getHistorico() {
		return registro;
	}
}
