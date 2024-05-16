package exercicio6;

public class Singleton {
	//instancia única e estatica
	private static Singleton instance;
	//privando o construtor para evitar outras instancias por meio dele
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null) {// verifica se a instancia ja foi criada
			instance = new Singleton();
		}
		return instance;// retorna a única instancia
	}
	
}
