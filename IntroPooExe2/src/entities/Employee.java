package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		double UpSalary = (netSalary() + (grossSalary * (percentage / 100)));
		System.out.println("Update data: " + name + ", $ " + String.format("%.2f%n", UpSalary));
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}

}
