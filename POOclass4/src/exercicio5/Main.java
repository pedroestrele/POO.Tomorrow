package exercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sair=0;
		while(sair!=1) {
			System.out.println("Do you wish to register a Hourly employee(1)"
					+ " or a Salaried one(2)?");
			int opcao=input.nextInt();
			input.nextLine();//limpando quebra de linha
			switch(opcao) {
				case 1:
					System.out.println("employee's name:");
					String name = input.nextLine();
					System.out.println("employee's hourly rate:");
					double rate = input.nextDouble();
					input.nextLine();//limpando quebra de linha
					System.out.println("how many hours has "+name+" worked this month");
					double hours = input.nextDouble();
					input.nextLine();//limpando quebra de linha
					Hourly.insertData(name, rate,hours);
					System.out.println("hourly employee successfully registered");
					break;
				case 2:
					System.out.println("employee's name:");
					name = input.nextLine();
					System.out.println("employee's salary:");
					double salary = input.nextDouble();
					input.nextLine();//limpando quebra de linha
					Salaried.insertData(name, salary);
					System.out.println("salaried employee successfully registered");
					break;
				default:
					System.out.println("not identified option, try again");
					break;
			}
			System.out.println("do you want to leave the system(1), or to register another"
					+ " employee?(0)");
			sair = input.nextInt();
			input.nextLine();
		}
		System.out.println("the total amount to pay is: "+Employee.totalToPay()+"U$");
		input.close();
	}
}
