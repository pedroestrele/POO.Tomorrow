package fatorial;

import java.util.*;

public class Fatorial {
	//definindo a operação fatorial
	static long factorialoperation(int n){
		long y = 1;
		for(int i=2;i<=n;i++) {
			y *=i;
			}
		return y;
		
	}
	
	public static void main(String[] args) {

//		scaneando o numero n(numero de termos da sequencia)
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número de fatoriais:");
		int n = input.nextInt();
		input.nextLine();//limpando a entrada
		long[] factorials = new long[n];

		//opção 1- fatoriais de n a n+n
/*		for(int j=0;j<factorials.length;j++) {
			factorials[j] = factorialoperation(n);
			n++;
		}
		System.out.println(Arrays.toString(factorials));
		
		// opção 2 - fatoriais de 0 a n
		for(int j=0; j<n; j++) {
			factorials[j] = factorialoperation(j);
	
		}
		System.out.println(Arrays.toString(factorials));
*/		
		//opção 3- fatoriais de uma lista dada pelo usuário
		System.out.println("Digite lista de numeros");
		String numeros = input.nextLine();	
		String separa = "[.\\,\\s]";//critérios de separação
		String[] listaTamanho = numeros.split(separa);//separando termos da lista
		//transformando de string p/ int
		int[] listadenumeros = new int[listaTamanho.length];
		for(int i=0; listadenumeros.length>i;i++) {
			listadenumeros[i] = Integer.parseInt(listaTamanho[i]);
		}
		//fazendo fatorial de cada termo
		for(int j=0;j<listadenumeros.length;j++) {
			factorials[j] = factorialoperation(listadenumeros[j]);
		}
		System.out.println("os fatoriais desses "
				+ "números são: "+Arrays.toString(factorials));
	
	input.close();
	}
	
}
