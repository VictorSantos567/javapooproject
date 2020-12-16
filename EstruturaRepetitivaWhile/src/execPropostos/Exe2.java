package execPropostos;

import java.util.Scanner;

/**
 * @author victo Escreva um programa para ler as coordenadas (X,Y) de uma
 *         quantidade indeterminada de pontos no sistema cartesiano. Para cada
 *         ponto escrever o quadrante a que ele pertence. O algoritmo será
 *         encerrado quando pelo menos uma de duas coordenadas for NULA (nesta
 *         situação sem escrever mensagem alguma).
 */
public class Exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y;

		X = sc.nextInt();
		Y = sc.nextInt();

		while (!(X == 0 || Y == 0)) {
			if (X >= 0 && Y >= 0) {
				System.out.println("primeiro");
			} else if (X <= 0 && Y >= 0) {
				System.out.println("segundo");
			} else if (X <= 0 && Y <= 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();

	}

}
