package hipotenusa;
import java.util.*;
public class Hipotenusa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ladolimite = input.nextInt();//Lado máximo que queremos testar
		int quantidade = 0;//Quantidade de lados com hipotenusa inteira
		int[] control = new int[ladolimite];//Lista controle
		//Achando as hipotenusas
		for(int i=5;i<=ladolimite;i++) {
			for(int j=4;j<i;j++) {
				for(int k=3;k<j;k++) {
					if(i*i == j*j+k*k) {
						if(quantidade==0) {
							quantidade++;
							control[0] = i;
						}else if(control[quantidade-1]!=i){//teste para impedir
						quantidade++;					   //repetições
						control[quantidade-1] = i;
						} 
					}
					
				}
			}
		}
		//Transferindo lista para outra com o tamanho correto
		int[] hipotenusaint = new int[quantidade];
		for(int i=0;i<quantidade;i++) {
			hipotenusaint[i]=control[i];
		}
		//Saída
		if(quantidade>0) {
		System.out.println("As Hipotenusas inteiras"
				+ " de 1 a "+ladolimite+" são: "+Arrays.toString(hipotenusaint));
		}else {
			System.out.println("Não há nenhuma hipotenusa inteira de 1 a "
					+ladolimite);
		}
	input.close();
	}
}
