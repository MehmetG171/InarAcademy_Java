package PackageChapter11;

import java.util.ArrayList;

public class NewAccount {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();
	private String name;
	private ArrayList<Transaction> transactions;

	NewAccount() {
		transactions = new ArrayList<>();
	}

	NewAccount(int id, double balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
		transactions = new ArrayList<Transaction>();
	}

	NewAccount(int id, double balance) {
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

	void withdraw(double amount) {
		balance = balance - amount;
		transactions.add(new Transaction('W', amount, balance, "Withdraw from account"));
	}

	void deposit(double amount) {
		balance = balance + amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit for account"));
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
