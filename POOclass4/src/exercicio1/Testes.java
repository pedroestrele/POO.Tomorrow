package exercicio1;

import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("quantas figuras geometricas você deseja fazer?");
		int numDeObj = input.nextInt();
		input.nextLine();//limpando linha quebrada
		ObjetoGeometrico[] objetos = new ObjetoGeometrico[numDeObj];//lista abstrata de objetos
		for(int i=0; i<numDeObj;i++) {//loop para criação dos objetos
			System.out.println("escolha qual o objeto criar: Circulo(1) Retangulo(2) Triangulo Retangulo(3)");
			int escolha = input.nextInt();
			input.nextLine();//limpando linha quebrada
			switch(escolha) {
			case 1://caso de escolha - objeto é um circulo
				objetos[i] = new Circulo();
				System.out.println("digite a coordenada x do centro do circulo:");
				double x = input.nextDouble();
				System.out.println("digite a coordenada y do centro do circulo:");
				double y = input.nextDouble();
				System.out.println("digite o raio do circulo em cm:");
				double raio = input.nextDouble();
				objetos[i].inicializar(x, y, raio);
				input.nextLine();//limpando linha quebrada
				break;
			case 2://caso de escolha - objeto é um retangulo
				objetos[i] = new Retangulo();
				System.out.println("digite o primeiro lado do retangulo em cm:");
				double lado1 = input.nextDouble();
				System.out.println("digite o segundo lado do retangulo em cm:");
				double lado2 = input.nextDouble();
				objetos[i].inicializar(lado1, lado2,0);
				input.nextLine();//limpando linha quebrada
				break;
			case 3://caso de escolha - objeto é um triangulo
				objetos[i] = new Triangulo();
				System.out.println("digite a hipotenusa do triangulo em cm:");
				double hip = input.nextDouble();
				System.out.println("digite a altura do triangulo em cm:");
				double altura = input.nextDouble();
				System.out.println("digite o outro cateto do triangulo em cm:");
				double cat = input.nextDouble();
				objetos[i].inicializar(hip,altura,cat);
				input.nextLine();//limpando linha quebrada
				break;
			}
			
			
		}
		input.close();//fechando scanner
		for(int i=0;i<numDeObj;i++) {
			//imprime numero do objeto na lista
			System.out.println("objeto geometrico "+(i+1));
			//imprime area
			System.out.println("Area = "+objetos[i].getArea()+"cm²");
			//imprime perimetro
			System.out.println("Perimetro = "+objetos[i].getPerimetro()+"cm");
		}
		
		
		
	}

}
