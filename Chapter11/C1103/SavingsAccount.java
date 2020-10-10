package PackageChapter11;

public class SavingsAccount extends Account {

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Warning! Overdrawn amount.");
		}
	}

	public String toString() {
		return super.toString();
	}
}
