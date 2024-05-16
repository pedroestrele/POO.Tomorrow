package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sair do sistema(1) ou Registrar um disco(2)");
		int opcao = input.nextInt();
		input.nextLine();//limpando quebra de linha
		if(opcao==2) {
			System.out.println("deseja registrar um DVD(1) ou um CD(2)");
			int disco = input.nextInt();
				switch(disco){
				case 1:
					DVD dvd = new DVD();
					input.nextLine();//limpando quebra de linha
					dvd.inserirDados(input);
					System.out.println("registrado: "+dvd.getDetalhes());
					break;
				case 2:
					CD cd = new CD();
					input.nextLine();//limpando quebra de linha
					cd.inserirDados(input);
					System.out.println("registrado: "+cd.getDetalhes());
					break;
				}
			main(args);
		}else {
			System.out.println("Saindo do Sistema");
		}
	}
	
}
