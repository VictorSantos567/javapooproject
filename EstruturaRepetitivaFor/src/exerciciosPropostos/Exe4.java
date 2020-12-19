package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo Fazer um programa para ler um número N. Depois leia N pares de
 *         números e mostre a divisão do primeiro pelo segundo. Se o denominador
 *         for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class Exe4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, p1, p2;
		float divisao;
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			p1 = sc.nextInt();
			p2 = sc.nextInt();

			if (p2 == 0) {
				System.out.println("divisao impossivel");
			}else {
				divisao = (float) p1 / p2;
				System.out.printf("%.1f%n", divisao);
			}

		}
		
		sc.close();
	}

}
