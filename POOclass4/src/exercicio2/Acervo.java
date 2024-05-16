package exercicio2;

public class Acervo extends Livro{
//livro do acervo da biblioteca
	public Acervo(String titulo, int numVolume) {
		super(titulo,numVolume);
		podeSair = true;//esse tipo de livro pode ser emprestado
	}
}
