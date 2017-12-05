public class Employee {
	private String name;
	private double salary;

	public Employee(String newName, double newSalary) {
		name = newName;
		salary = newSalary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double byPercent) {
		salary *= (1 + byPercent/100);
	}
	public void cutSalary(double byPercent) {
		salary *= (1 - byPercent/100);
	}
}