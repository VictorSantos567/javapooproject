package bank;

public class Account {
	private int numberAccount;
	private String name;
	private double initialDeposit;

	public Account() {
	}

	public Account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public Account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.initialDeposit = initialDeposit;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public double deposit(double deposit) {
		return initialDeposit += deposit;
	}

	public double withdraw(double withdraw) {
		return initialDeposit = (initialDeposit - 5.00) - withdraw;
	}

	public String toString() {
		return 	"Account= " + getNumberAccount() + ", name= " + getName() + ", initialDeposit= "
				+ String.format("%.2f%n", getInitialDeposit());
	}

}
