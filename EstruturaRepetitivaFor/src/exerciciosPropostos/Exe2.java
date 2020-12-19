package exerciciosPropostos;

import java.util.Scanner;

/**
 * @author victo Leia um valor inteiro N. Este valor ser� a quantidade de
 *         valores inteiros X que ser�o lidos em seguida. Mostre quantos destes
 *         valores X est�o dentro do intervalo [10,20] e quantos est�o fora do
 *         intervalo, mostrando essas informa��es conforme exemplo (use a
 *         palavra "in" para dentro do intervalo, e "out" para fora do
 *         intervalo).
 */
public class Exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X, in = 0, out = 0;
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			} else
				out++;

		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();

	}

}
