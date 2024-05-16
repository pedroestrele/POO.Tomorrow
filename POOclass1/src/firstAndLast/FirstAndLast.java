package firstAndLast;
import java.util.*;
public class FirstAndLast {

	public static void main(String[] args) {
		// read number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		String number = input.next();
		// separate digits
		String[] parts = number.split("");
		//find first and last
		String firstDigit = parts[0];
		String lastDigit = parts[parts.length-1];
		//compare
		if(firstDigit.equals(lastDigit)) {
			System.out.println("The first and last digits are the same");
		}else {
			System.out.println("The first and last digits are different");
		}
		
		input.close();
	}
}
