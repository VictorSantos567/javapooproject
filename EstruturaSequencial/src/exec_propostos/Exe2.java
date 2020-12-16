package exec_propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo Faça um programa para ler o valor do raio de um círculo, e
 *         depois mostrar o valor da área deste círculo com quatro casas
 *         decimais conforme exemplos. Fórmula da área: area = π . raio2
 *         Considere o valor de π = 3.14159
 */
public class Exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float raio;
		double pi = 3.14159, area;

		raio = sc.nextFloat();

		area = pi * (Math.pow(raio, 2));

		System.out.printf("%.4f%n", area);

		sc.close();

	}

}
