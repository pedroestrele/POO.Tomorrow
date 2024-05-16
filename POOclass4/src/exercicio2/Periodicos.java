package exercicio2;

public class Periodicos extends Livro {
	//livro periodico(não pode sair da biblioteca)
	public Periodicos(String titulo, int numVolume) {
		super(titulo, numVolume);
		podeSair=false;//esse tipo de livro NÃO pode ser emprestado
	}
	

}
