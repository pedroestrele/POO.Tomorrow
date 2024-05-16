package evenOrOdd;
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
	    // reading the number
	    Scanner number = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int num = number.nextInt();
	    //even or odd?
	    if (num%2 == 0){
	      System.out.println("The number is even");
	    }else {
	      System.out.println("The number is odd");
	    }
	    number.close();
	  }
}
