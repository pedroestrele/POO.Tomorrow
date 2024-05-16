package exercicio3;

public class ContaCorrente extends ContaTipo {
	
	public ContaCorrente(Cliente cliente,String agencia, String identificador) {
		super(cliente,agencia,identificador);
	}
	//metodo para saque (sem cobrança)
	@Override
	public double saque(double sacado,String data){
		if(this.saldo>=sacado) {//verifica se o cliente tem saldo suficiente para o saque
			saldo-=sacado;
			Transacoes transacao = new Transacoes(sacado,data,"saque");
			transacoes.add(transacao);
			return sacado;
		}else {
			System.out.println("saldo não disponível");
			return 0;
		}
	}

	
	
}
