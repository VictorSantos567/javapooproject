package exec_propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de
 *         pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o
 *         n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre
 *         o valor a ser pago.
 */
public class Exe5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c1, c2, nPecas1, nPecas2;
		double valorUnitario1, valorUnitario2, valorPagar;

		c1 = sc.nextInt();
		nPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();

		c2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();

		valorPagar = (nPecas1 * valorUnitario1) + (nPecas2 * valorUnitario2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		sc.close();
	}

}
