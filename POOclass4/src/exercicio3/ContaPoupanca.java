package exercicio3;

public class ContaPoupanca extends ContaTipo{
	private int mes=1;//o ano começa em janeiro
	//construtor
	public ContaPoupanca(Cliente cliente,String agencia, String identificador) {
		super(cliente,agencia,identificador);
	}
	//saque de dinheiro
	@Override
	public double saque(double sacado,String data){
		if(this.saldo>=sacado) {//verifica se o cliente tem o saldo para saque
			saldo-=sacado;
			Transacoes transacao = new Transacoes(sacado,data,"saque");
			transacoes.add(transacao);
			return sacado-0.05*sacado;//taxa de 5% do saque
		}else {
			System.out.println("saldo não disponível");
			return 0;
		}
	}
	//rendimento mensal da poupança
	private void rendimento(String data) {
		double rendimento = saldo*0.04;
		this.saldo+=rendimento;
		Transacoes transacao = new Transacoes(rendimento,data,"rendimento");
		transacoes.add(transacao);
	}
	
	public void novoMes() {
		mes++;//o mes passa
		String data;
		if(mes<10) {//metodo para formatar a data
			data = "01/0"+mes;
		}else {
			data = "01/"+mes;
		}
		rendimento(data);//o saldo rende no 1º dia de cada mes
	}
	
	
}
