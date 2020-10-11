package PackageChapter11;

public class Transaction {

	private double balance;
	private String description;
	private double amount;
	private char type;
	private java.util.Date dateCreated;

	public Transaction(char type, double amount, double balance, String description) {
		this.description = description;
		this.balance = balance;
		this.amount = amount;
		this.type = type;
		dateCreated = new java.util.Date();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}
}
