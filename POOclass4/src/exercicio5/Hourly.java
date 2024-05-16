package exercicio5;


public class Hourly extends Employee {
	double hours;//amount of hours that employee worked
	double hourlyRate;//hourly rate of that employee
	
	private Hourly(String name, double rate) {
		super(name);
		hourlyRate=rate;
	}
	
	@Override
	public double getPay() {
		double payed = hours*hourlyRate;
		return payed;
	}
	
	public void addHours(double hours) {
		this.hours+=hours;
	}
	
	public static void insertData(String name, double rate, double hours) {
		Hourly employee = new Hourly(name,rate);
		employees.add(employee);
		employee.addHours(hours);
	}
	
	
	
	
}
