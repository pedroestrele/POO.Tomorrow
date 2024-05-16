package numeroTriangular;
import java.util.*;
public class NumeroTriangular {
	public static void main(String[] args) {
		System.out.println("digite um numero: ");
		Scanner input = new Scanner(System.in);
		long number = input.nextLong(); //recebendo numero
		boolean found = false;
		input.close();
		//testando pra descobrir se é triangular
		for(long i=1;i*(i+1)*(i+2)<=number;i++) {
			if(i*(i+1)*(i+2) == number) {
				found = true;
				System.out.println(number+" é triangular");
				break;
			}
			
		}
		if(!found) {
			System.out.println(number+" não é triangular");
		}
		
	}
	
	
}
