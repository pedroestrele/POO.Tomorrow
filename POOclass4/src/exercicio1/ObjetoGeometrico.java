package exercicio1;

public abstract class ObjetoGeometrico {
	protected double area;
	protected double perimetro;
	//metodo para inicializar cada objeto
	abstract void inicializar(double x, double y,double z);
	
	abstract void calcularArea();//calcula e inicializa a double area
	abstract void calcularPerimetro();//calcula e inicializa a double perimetrro
	
	//metodo para calcular a area e o perimetro a partir dos outros dois metodos
	protected void callCalculo() {
		calcularArea();
		calcularPerimetro();
	}
	//metodos para retornar os valores de area e de perimetro
	public double getArea() {
		return this.area;
	}
	public double getPerimetro() {
		return this.perimetro;
	}
	
}
