package bank;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ContaBancaria {
	private float saldo=0;
	private String numeroConta;
	private String titular;
	public boolean confiavel = true;
	private float dividas;
	private static Set<String> numDasContas = new HashSet<>();
	// titular da conta
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String titular) {
		this.titular = titular;
		Random rand = new Random();
		String numeroDaConta; // gerando numero da conta de modo aleatório
			do{//e garantindo que o numero gerado sera unico
				numeroDaConta = "";
				for(int i=0;i<8;i++) {
				int randomDig = rand.nextInt(10);
				numeroDaConta=numeroDaConta + randomDig;
				}
				numeroConta = numeroDaConta;
			}while(numDasContas.contains(numeroConta));
			numDasContas.add(numeroConta);			   //adicionando ao "sistema"
	}
	
	
	public static float formatarDinheiro(float saldo) {
		int saldoInteiro = (int)(saldo*100);
		saldo = (float) (saldoInteiro/100);
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	
	// numero da conta
	public String getNumeroConta() {
		return numeroConta;
	}
	// manipulações de saldo
	public float getSaldo() {
		saldo=ContaBancaria.formatarDinheiro(saldo);
		return saldo;
	}
	public void deposito(float depositado) {
			if(depositado>0) {
				saldo = saldo+depositado;
				saldo=ContaBancaria.formatarDinheiro(saldo);
			}
	}
	public float saque(float retirado) {
		if(saldo>=retirado) {
			saldo = saldo-retirado;
			saldo=ContaBancaria.formatarDinheiro(saldo);
			return retirado;
		}else {
			System.out.println("Saldo não suficiente");
			return 0.0f;
		}
	}
	public void transferencia(ContaBancaria recebe,float depositado) {
		if(this.saldo>=depositado) {
			this.saldo-=depositado;
			recebe.saldo+=depositado;
			this.saldo=ContaBancaria.formatarDinheiro(this.saldo);
			recebe.saldo=ContaBancaria.formatarDinheiro(recebe.saldo);
		}
		else {
			System.out.println("Saldo não suficiente");
		}
	}
	public void emprestimo(float quantiaEmprestada) {
		if(confiavel) {
			dividas=quantiaEmprestada;
			saldo+=quantiaEmprestada;
			dividas = ContaBancaria.formatarDinheiro(dividas);
			saldo = ContaBancaria.formatarDinheiro(saldo);
			confiavel=false;
		}
		
	}
	public void pagarEmprestimo() {
		if(confiavel) {
			System.out.println("Você não tem dividas pendentes");
		}else {
			if(saldo>=dividas) {
				saldo = saldo-dividas;
				saldo = ContaBancaria.formatarDinheiro(saldo);
				dividas=0;
				confiavel=true;
			}else {
				dividas-=saldo;
				dividas = ContaBancaria.formatarDinheiro(dividas);
				saldo=0;
				System.out.println("Pagamento efetuado! o Sr(a)"+titular+" ainda deve"
						+ " ao banco "+dividas+" reais");
			}
		}
	}
	
	

}
