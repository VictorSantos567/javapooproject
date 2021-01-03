package program;

import java.util.Scanner;

/**
 * @author victoFazer um programa para ler dois números inteiros M e N, e depois
 *         ler uma matriz de M linhas por N colunas contendo números inteiros,
 *         podendo haver repetições. Em seguida, ler um número inteiro X que
 *         pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 *         esquerda, acima, à direita e abaixo de X, quando houver, conforme
 *         exemplo
 *
 */
public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int X = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (X == mat[i][j]) {
					System.out.println();
					System.out.println("position: " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

			}
		}

		sc.close();

	}

}
