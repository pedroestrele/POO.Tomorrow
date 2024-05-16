package exercicio3;

import java.util.HashSet;
import java.util.Set;

public abstract class ContaTipo {
	//caracteristicas de ambas as contas bancarias
	protected String identificador;
	protected String agencia;
	protected Cliente cliente;
	protected double saldo=0;
	//cada conta bancaria tem uma lista com todas as transações feitas
	protected Set<Transacoes> transacoes = new HashSet<>();
	
	protected ContaTipo(Cliente cliente,String agencia, String identificador) {
		this.cliente=cliente;
		this.agencia = agencia;
		this.identificador = identificador;
	}
	//saque muda conforme o tipo da conta
	abstract double saque(double sacado,String data);
	
	//o deposito permanece inalterado conforme o tipo da conta
	public void deposito(double depositado,String data) {
		this.saldo+=depositado;
		Transacoes transacao = new Transacoes(depositado,data,"deposito");
		transacoes.add(transacao);
	}
	//dada uma data é impresso a lista de transações realizadas nesse dia
	public void historico(String data) {
		System.out.println("transações do dia "+data);
		for(Transacoes transacoesDiaData: transacoes) {
			if(transacoesDiaData.getData().equals(data)) {
				System.out.println(transacoesDiaData.getHistorico());
			}
		}
	}
	
	

}
