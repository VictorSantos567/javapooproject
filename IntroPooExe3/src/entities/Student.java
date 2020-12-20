package entities;

public class Student {
	public String name;
	public double firstQuarter;
	public double secondQuarter;
	public double thirdQuarter;
	
	public double finalGrade() {
		return firstQuarter + secondQuarter + thirdQuarter;
	}

	public void approved() {
		if (finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missing = 60 - finalGrade();
			System.out.println("MISSING " + String.format("%.2f%n",missing) + "POINTS");
		}
	}

}
