package exercicio7;

import java.util.*;

public class SerieLimitada {
	private static int[] serielimitada;
	private final static int maximoDeInstancias;
	private static int contador = 0;
	//construtor privado para impedir instancias diretas 
	private SerieLimitada(int contador,int digito)  {
		serielimitada[contador-1]=digito;
	}
	//metodo para definir o maximo de instancias da classe a serem criadas
	//com tamanho minimo de 1 e maximo de 5
	private static int tamanhoDaSerie(int tamanho) {
		if(tamanho>0&&tamanho<6) {
			serielimitada = new int[tamanho];
			return tamanho;
		}
		return 0;
	}
	//inicializando a variavel maximoDeInstancias
	static {
		Random rand = new Random();
		maximoDeInstancias=tamanhoDaSerie(rand.nextInt(1,6));
	}
	
	//metodo para criar uma instancia de nº x da serie(com x começando do 1)
	public static void proximoDigito(int digito) {
		//verificando se o inteiro inserido é um unico digito
		boolean isDigito = digito<10&&digito>=0;
		//verificando se já foi definido o tamanho da serie e se já foram criadas 
		//o nº maximo de instancias
		if(maximoDeInstancias!=0&&contador<maximoDeInstancias&&isDigito) {
			new SerieLimitada(contador+1,digito);
			contador++;
		}
		
	}
	//metodo para imprimir na tela o numero de serie
	public static void imprimir() {
		for(int i=0;i<maximoDeInstancias;i++) {
			System.out.print(serielimitada[i]);
		}
	}
	//metodo para retornar uma string contendo a serie limitada em questão
	public static String String() {
		String numero="";
		for(int i=0;i<maximoDeInstancias;i++) {
			numero+=serielimitada[i];
		}
		return numero;
	}
	//metodo para retornar indiretamente o maximo de instancias da classe
	public static int getMaxInstancias() {
		return maximoDeInstancias;
	}
	
}
