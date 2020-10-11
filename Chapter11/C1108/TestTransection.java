package PackageChapter11;

public class TestTransection {

	public static void main(String[] args) {

		NewAccount account = new NewAccount(1122, 1000, "George");

		account.setAnnualInterestRate(1.5);

		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		System.out.println("Name --> " + account.getName());
		System.out.println("Interest Rate --> " + account.getAnnualInterestRate());
		System.out.println("Balance --> " + account.getBalance());
		

		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.println("");
			System.out.println("Date --> " + account.getTransactions().get(i).getDateCreated());
			System.out.println("Type --> " + account.getTransactions().get(i).getType());
			System.out.println("Description --> " + account.getTransactions().get(i).getDescription());
			System.out.println("Amount --> $" + account.getTransactions().get(i).getAmount());
			System.out.println("Balance --> $" + account.getTransactions().get(i).getBalance());
		}

	}

}
