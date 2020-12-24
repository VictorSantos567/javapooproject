package app;

import java.util.Locale;
import java.util.Scanner;

import bank.Account;

/**
 * @author victo Em um banco, para se cadastrar uma conta banc�ria, � necess�rio
 *         informar o n�mero da conta, o nome do titular da conta, e o valor de
 *         dep�sito inicial que o titular depositou ao abrir a conta. Este valor
 *         de dep�sito inicial, entretanto, � opcional, ou seja: se o titular
 *         n�o tiver dinheiro a depositar no momento de abrir sua conta, o
 *         dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�,
 *         naturalmente, zero. Importante: uma vez que uma conta banc�ria foi
 *         aberta, o n�mero da conta nunca poder� ser alterado. J� o nome do
 *         titular pode ser alterado (pois uma pessoa pode mudar de nome por
 *         ocasi�o de casamento, por exemplo). Por fim, o saldo da conta n�o
 *         pode ser alterado livremente. � preciso haver um mecanismo para
 *         proteger isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui
 *         por meio de saques. Para cada saque realizado, o banco cobra uma taxa
 *         de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o
 *         for suficiente para realizar o saque e/ou pagar a taxa. Voc� deve
 *         fazer um programa que realize o cadastro de uma conta, dando op��o
 *         para que seja ou n�o informado o valor de dep�sito inicial. Em
 *         seguida, realizar um dep�sito e depois um saque, sempre mostrando os
 *         dados da conta ap�s cada opera��o
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = null ;

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char choice = sc.nextLine().charAt(0);

		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, name, initialDeposit);

		} else if (choice == 'n') {
			account = new Account(numberAccount, name);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);

		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
