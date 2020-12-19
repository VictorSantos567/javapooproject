package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo Leia 1 valor inteiro N, que representa o número de casos de
 *         teste que vem a seguir. Cada caso de teste consiste de 3 valores
 *         reais, cada um deles com uma casa decimal. Apresente a média
 *         ponderada para cada um destes conjuntos de 3 valores, sendo que o
 *         primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
 *         valor tem peso 5
 */
public class Exe3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N;
		float V1, V2, V3, media=0;
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			V1 = sc.nextFloat();
			V2 = sc.nextFloat();
			V3 = sc.nextFloat();

			media = ((V1 * 2) + (V2 * 3) + (V3 * 5)) / (2 + 3 + 5);
			
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
