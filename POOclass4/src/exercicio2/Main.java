package exercicio2;

public class Main {
	public static void main(String[] args) {
		Acervo livro = new Acervo("Romeu e Julieta", 129);
		Periodicos livroPeriodico = new Periodicos("Harry Potter", 12);
		livro.emprestar();//emprestando livro do acervo
		livroPeriodico.emprestar();//emprestando livro periodico(NÃO EMPRESTA)
		livro.emprestar();//tentando emprestar livro emprestado
		livro.devolver();//devolvendo livro
		
		
	
	}
	
	
}
