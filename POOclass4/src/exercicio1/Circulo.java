package exercicio1;

public class Circulo extends ObjetoGeometrico {
	private double x;// coordenada x do centro do circulo
	private double y;// coordenada y do centro do circulo
	private double raio;//raio do circulo
	
	
	@Override
	public void inicializar(double x, double y, double raio){//inicialização do circulo
		this.x = x ;
		this.y = y ;
		this.raio = raio;
		callCalculo();
	}
	@Override
	protected void calcularArea() {//calcula a area do circulo na inicialização
		this.area=Math.pow(raio, 2)*Math.PI;
	}
	//calcula a circunferencia do circulo na inicialização
	@Override
	protected void calcularPerimetro() {
		this.perimetro=2*raio*Math.PI;
	}
	
	//retorna o raio
	public double getRaio() {
		return raio;
	}
	//retorna o par ordenado do centro do circulo
	public String getCentro() {
		return "("+x+","+y+")";
	}
	
}
