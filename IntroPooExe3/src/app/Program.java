package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		student.name = sc.nextLine();
		student.firstQuarter = sc.nextDouble();
		student.secondQuarter = sc.nextDouble();
		student.thirdQuarter = sc.nextDouble();

		System.out.println("FINAL GRADE = " + student.finalGrade());
		student.approved();

		sc.close();
	}

}
