package exercicio5;

import java.util.HashSet;
import java.util.Set;

public abstract class Employee {
protected String name;
//list of every employee registered(in random order)
static Set<Employee> employees = new HashSet<>();

protected Employee(String name) {
	this.name = name;
}


abstract double getPay();//returns the total amount to be payed to the employee


public void printPay() {
	System.out.println("the employee"+name+" was payed "+getPay()+"this month");
}
//method that returns the total amount of money to be payed to the employees
public static double totalToPay() {
	double total=0;
	for(Employee employee:employees) {
		total+=employee.getPay();
	}
	return total;
}


}
	

