package exercicio2;

public abstract class Livro {
	protected String titulo;
	protected int numVolume;
	protected boolean podeSair;//variavel para definir se um livro pode sair da biblioteca
	protected boolean disponivel=false;//verifica a disponibilidade do livro
	
	//construtor de Livro definindo o titulo e o num do volume ao ser criado
	protected Livro(String titulo, int numVolume) {
		this.numVolume=numVolume;
		this.titulo=titulo;
	}
	//metodo para emprestar um livro
	public void emprestar() {
		if(podeSair&&disponivel) {//se o livro pode sair e está disponível
			disponivel=false;
			System.out.println(titulo+" foi emprestado");
		}else {
			System.out.println("Livro "+titulo+" de volume "+numVolume+" não disponível para empréstimo");
		}
		
	}
	//metodo para devolver um livro emprestado
	public void devolver() {
		if(!disponivel) {
			disponivel=true;
			System.out.println("Livro "+titulo+" de volume " +numVolume+" agora está disponível para empréstimo");
		}
		
	}
	
	
}
