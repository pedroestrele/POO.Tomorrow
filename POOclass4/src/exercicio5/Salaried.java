package exercicio5;

public class Salaried extends Employee{
	double salary;
	
	private Salaried(String name,double salary) {
		super(name);
		this.salary = salary;//the salaried gets payed the amount of its salary
	}
	@Override
	public double getPay() {//returns the salary of the employee
		return salary;
	}
	
	public static void insertData(String name, double salary) {
		Salaried employee = new Salaried(name,salary);
		employees.add(employee);
	}
	
}
