package PackageChapter11;

public class CheckingAccount extends Account {

	private double limit = -10;

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public CheckingAccount(int id, double balance, double limit) {
		super(id, balance);
		this.limit = limit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > getLimit()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Warning! Exceeding limit.");
		}
	}

	public String toString() {
		return super.toString() + "\nOverdraft limit --> $" + limit;
	}

}
