package bank;

import java.util.Random;
import java.util.Scanner;

public class Operações {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		ContaBancaria Governo = new ContaBancaria();
		ContaBancaria Microsoft = new ContaBancaria("Bill Gates");
		ContaBancaria Apple = new ContaBancaria("Steve Jobs");
		ContaBancaria usuario = new ContaBancaria("Pedro Marcos");
		ContaBancaria mercadinho = new ContaBancaria("Seu Zé");
		Microsoft.deposito(rand.nextFloat(10000000));
		Apple.deposito(rand.nextFloat(10000000));
		Microsoft.transferencia(usuario, rand.nextFloat(2000,4000));
		float salarioPago=usuario.getSaldo();
		usuario.transferencia(Governo,(float) (130+(0.15*salarioPago)));
		mercadinho.emprestimo(10000);
		mercadinho.saque(rand.nextFloat(1000,5000));
		mercadinho.transferencia(Microsoft, rand.nextFloat(200,1000));
		mercadinho.transferencia(Apple, rand.nextFloat(200,1000));
		usuario.transferencia(mercadinho,rand.nextFloat(100,2000));
		mercadinho.deposito(rand.nextFloat(1000,10000));
		mercadinho.pagarEmprestimo();
		
		System.out.println(usuario.getTitular()+" com conta de número "
		+usuario.getNumeroConta()+" possui saldo de "+usuario.getSaldo());
		if(usuario.confiavel) {
			System.out.println("é confiável!");
		}else {
			System.out.println ("não é confiável");
		}
		System.out.println(mercadinho.getTitular()+" com conta de número "
		+mercadinho.getNumeroConta()+" possui saldo de "+mercadinho.getSaldo());
		if(mercadinho.confiavel) {
			System.out.println("é confiável!");
		}else {
			System.out.println ("não é confiável >:(");
		}
		input.close();
	}
}
