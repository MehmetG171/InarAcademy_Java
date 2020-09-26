package PackageChapter09;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();

	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	double withdraw(double amount) {
		return balance = balance - amount;
	}

	double deposit(double amount) {
		return balance = balance + amount;
	}

}
