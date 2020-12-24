package app;

import java.util.Locale;
import java.util.Scanner;

import bank.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char choice = sc.nextLine().charAt(0);

		if (choice == 'y') {
			System.out.print("Enter initial deposit value:");
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
