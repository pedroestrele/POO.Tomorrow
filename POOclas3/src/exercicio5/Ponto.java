package exercicio5;

public class Ponto {
	private int x;
	private int y;
	
	//construtor vazio manda ponto para a origem
	public Ponto() {
		x = 0;
		y = 0;
	}
	//construtor com as coordenadas do ponto
	public Ponto(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//construtor baseado em outro ponto(novo ponto = ponto base)
	public Ponto(Ponto base) {
		this.x = base.x;
		this.y = base.y;
	}
	//metodo para deslocar o ponto em x e y
	public void desloca(int dx,int dy) {
		x += dx;
		y += dy;
	}
	//metodo para deslocar o ponto em x e y a partir de outro ponto
	public void desloca(Ponto soma) {
		this.x += soma.x;
		this.y += soma.y;
	}
	//set - define as novas coordenadas para o ponto
	public void setPonto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//define as novas coodenadas do ponto a partir de um ponto inserido
	//x e y do this.ponto = pontoinserido
	public void setPonto(Ponto novoPonto) {
		this.x = novoPonto.x;
		this.y = novoPonto.y;
	}
	//imprime as coordenadas de um ponto
	public static void toString(Ponto ponto) {
		System.out.println("o ponto é: ("+ponto.x+", "+ponto.y+")");
	}
	
	
}
