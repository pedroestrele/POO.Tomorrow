package exercicio1;


public class Retangulo extends ObjetoGeometrico {
	double base;
	double altura;

	@Override
	public void inicializar(double base, double altura, double zero) {
		this.base = base;
		this.altura = altura;
		callCalculo();//calcula a area e o perimetro do retangulo
	}
	//metodo usado para chamar a inicialização do retangulo
	public void inicializar(double x, double y) {
		inicializar(x,y,0);
	}
	
	@Override
	protected void calcularArea() {
		area=base*altura;
	}
	@Override
	protected void calcularPerimetro() {
		perimetro=2*base+2*altura;
	}
	
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	
	
}
