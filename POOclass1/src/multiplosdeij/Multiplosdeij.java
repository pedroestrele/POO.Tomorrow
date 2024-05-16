package multiplosdeij;
import java.util.*;
public class Multiplosdeij {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//pagando entrada
		System.out.println("Digite o número n de multiplos:");
		int n = input.nextInt();
		System.out.println("Digite dois números base:");
		int multiplo1 = input.nextInt();
		int multiplo2 = input.nextInt();
		input.close();
		int[] resultado = new int[n];// lista dos n multiplos de x1 e x2
		int j=0;
		int i;
		//achando os n termos multiplos da entrada multiplo1||multiplo2
		for(i=0;j<n;i+=1) {
			if (i%multiplo1 == 0 || i%multiplo2 == 0) {
				resultado[j] = i;
				j++;
			}
		}
		//separando os numeros por virgula conforme a saida esperada
		String resposta = new String();
		for(int k=0;k<resultado.length;k++) {
			if( k==resultado.length-1){
			resposta += resultado[k]+".";
			}else {
				resposta+= resultado[k]+",";
			}
			
		}
		System.out.println("multiplos de "+multiplo1+" ou de "+multiplo2+":");
		System.out.println(resposta);
		
	}
	
	
}
