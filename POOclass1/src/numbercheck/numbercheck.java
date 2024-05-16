package numbercheck;
import java.util.*;
public class numbercheck {
	public static void main(String[] args) {
		// finding equal consecutive digits in numbers
		// scan number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		String num = input.nextLine();
		String[] parts = num.split("");//separate the digits
		int i;
		boolean found = false;
		input.close();
		//check if there is equal consecutive numbers
		for(i=0;i<parts.length-1;i++) {
			if (parts[i].equals(parts[i+1])) {
				found = true;
			}
			
		}
		if(!found) {
			System.out.println("no pair of equal consecutive numbers found");
		}else {
			System.out.println(num + " contains equal consecutive digits");
		}
	}

}
