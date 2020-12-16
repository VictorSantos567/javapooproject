package exec_propostos;

import java.util.Scanner;

/**
 * @author victo Faça um programa para ler dois valores inteiros, e depois
 *         mostrar na tela a soma desses números com uma mensagem explicativa,
 *         conforme exemplos.
 */
public class Exe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, soma;

		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		System.out.println("SOMA = " + soma);

		sc.close();
	}

}
