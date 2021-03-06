package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/**
 * @author victo Fazer um programa para ler os dados de um funcion�rio (nome,
 *         sal�rio bruto e imposto). Em seguida, mostrar os dados do funcion�rio
 *         (nome e sal�rio l�quido). Em seguida, aumentar o sal�rio do
 *         funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto
 *         � afetado pela porcentagem) e mostrar novamente os dados do
 *         funcion�rio
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();

		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.println("");
		employee.increaseSalary(percentage);

		sc.close();

	}

}
