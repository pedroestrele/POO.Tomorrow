package exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Filme {
	private String titulo;//titulo do filme
	private String diretor;//nome do diretor do filme
	private String genero;//gênero do filme 
	private String classIndicativa;//classificação indicativa do filme
	//lista com todos os filmes registrados
	private static Set<Filme> filmes = new HashSet<>();
	private Set<String> elenco = new HashSet<>();//lista contendo o elenco do filme
	private Set<Critica> avaliacoes= new HashSet<>();//lista com todas as criticas
	
	public Filme(String titulo, String diretor) {
		this.titulo = titulo;
		this.diretor=diretor;
		filmes.add(this);
		
	}
	public void addCritica(Critica critica) {
		avaliacoes.add(critica);
	}
	
	//metodo para recomendar filmes a partir do genero
	public static void recomendar(String genero) {
		System.out.println("recomendações a partir do gênero "+genero);
		for(Filme filme:filmes) {
			if(filme.getGenero().equals(genero)) {
				System.out.println(filme.getTitulo());
			}
		}
	}
	//recomendar filmes a partir do genero e de um diretor 
	public static void recomendar(String genero, String diretor) {
		System.out.println("recomendações a partir do gênero e do diretor "+genero);
		for(Filme filme:filmes) {
			if(filme.getGenero().equals(genero)&&filme.getDiretor().equals(diretor)) {
				System.out.println(filme.getTitulo());
			}
		}
	}
	//metodo para calcular media de avaliacoes
	public double avaliacaoMedia() {
		double soma=0;
		for(Critica critica:avaliacoes) {
			soma+=critica.getAvaliacao();
		}
		soma= soma/avaliacoes.size();
		return soma;
	}
	
	//metodo para achar um filme a partir de seu titulo
	public static Filme findFilme(String titulo) {
		for(Filme filme: filmes) {
			if(filme.getTitulo().equals(titulo)) {
				return filme;
			}
		}
		return null;
	}
	
	//getters e setters
	public String getTitulo() {
		return titulo;
	}


	public String getDiretor() {
		return diretor;
	}


	public Set<String> getElenco() {
		return elenco;
	}


	public String getGenero() {
		return genero;
	}


	public String getClassIndicativa() {
		return classIndicativa;
	}


	public Set<Critica> getAvaliacoes() {
		return avaliacoes;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}


	public void setClassIndicativa(String classIndicativa) {
		this.classIndicativa = classIndicativa;
	}
	
	
}
