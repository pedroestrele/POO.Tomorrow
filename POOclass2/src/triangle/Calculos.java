package triangle;
import java.util.Random;
public class Calculos {
	public static void main(String[] args) {
		Random rand = new Random();
		triangulo triangulo = new triangulo(rand.nextDouble(100)+1,rand.nextDouble(100)+1);
		String[] tipos = {"isosceles","retangulo"};
		int i = rand.nextInt(2);
		System.out.println(triangulo.getBase_altura()+" que é "+tipos[i]);
		System.out.println("a área é: "+triangulo.calculaArea());
		System.out.println("o perímetro é: "+triangulo.calculaPerimetro(tipos[i]));
		
		
	}
	

}
