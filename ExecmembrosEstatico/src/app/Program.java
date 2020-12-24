package app;

import java.util.Locale;
import java.util.Scanner;

import calculator.CurrenyConverter;

/**
 * @author victo Faça um programa para ler a cotação do dólar, e depois um valor
 *         em dólares a ser comprado por uma pessoa em reais. Informar quantos
 *         reais a pessoa vai pagar pelos dólares, considerando ainda que a
 *         pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma
 *         classe CurrencyConverter para ser responsável pelos cálculos
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
