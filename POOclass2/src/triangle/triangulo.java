package triangle;

public class triangulo {
	private double base;
	private double altura;
	private String tipoTriangulo;
	
	
	public triangulo(double base, double altura) {
		this.base = formatarNumero(base);
		this.altura = formatarNumero(altura);
	}
	
	public static double formatarNumero(double x) {
		int xInt=(int)(x*100);
		x = (double) xInt/100;
		return x;
	}
	
	
	//
	public String getBase_altura() {
		String base_altura = "Base-> "+base+" e Altura-> "+altura;
		return base_altura;
	}
	
	public double calculaArea() {
		double area = base*altura/2;
		return triangulo.formatarNumero(area);
	}
	
	public double calculaPerimetro(String tipoTriangulo) {
		this.tipoTriangulo = tipoTriangulo.toLowerCase();
		tipoTriangulo = this.tipoTriangulo;
		double perimetro=0;
		if(tipoTriangulo=="isosceles") {
			double cat1 = Math.sqrt(Math.pow(base,2)+Math.pow(altura, 2));
			perimetro = cat1*2+base;
		}else if(tipoTriangulo=="retangulo") {
			double hip = Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));
			perimetro=hip+altura+base;
		}
		return formatarNumero(perimetro);
	}
	
	
}
