package exec_propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo Fazer um programa que leia o n�mero de um funcion�rio, seu
 *         n�mero de horas trabalhadas, o valor que recebe por hora e calcula o
 *         sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do
 *         funcion�rio, com duas casas decimais
 */
public class Exe4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero, horasTrabalhadas;
		double valorHora, salario;

		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
