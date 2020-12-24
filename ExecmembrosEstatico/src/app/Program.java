package app;

import java.util.Locale;
import java.util.Scanner;

import calculator.CurrenyConverter;

/**
 * @author victo Fa�a um programa para ler a cota��o do d�lar, e depois um valor
 *         em d�lares a ser comprado por uma pessoa em reais. Informar quantos
 *         reais a pessoa vai pagar pelos d�lares, considerando ainda que a
 *         pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma
 *         classe CurrencyConverter para ser respons�vel pelos c�lculos
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amountDollar = sc.nextDouble();

		System.out.println("Amount to be paid in reais = "
				+ String.format("%.2f%n", CurrenyConverter.converter(priceDollar, amountDollar)));

		sc.close();

	}

}
