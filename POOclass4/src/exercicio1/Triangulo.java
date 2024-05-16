package exercicio1;

public class Triangulo extends ObjetoGeometrico {
	//
	double hip;//hipotenusa do triangulo retangulo
	double altura;//cateto equivalente a altura
	double cat;//cateto
	//definindo os metodos da classe mãe
	@Override
	public void inicializar(double hip, double altura, double cat) {
		//checando se o triangulo é retangulo
		if(hip==Math.sqrt(Math.pow(altura,2)+Math.pow(cat,2))) {
			//atribuindo as caracteristicas do triangulo
			this.hip = hip;
			this.altura = altura;
			this.cat = cat;
			callCalculo();
		}else {
			System.out.println("esse triangulo não é retangulo");
		}
		
	}
	@Override
	protected void calcularArea() {
		this.area=cat*altura/2;
	}
	@Override
	protected void calcularPerimetro() {
		this.perimetro = hip+cat+altura;
	}
	//metodos para retornar os lados do triangulo
	public double getHipotenusa() {
		return hip;
	}
	public double getAltura() {
		return altura;
	}
	public double getCateto() {
		return cat;
	}

}
