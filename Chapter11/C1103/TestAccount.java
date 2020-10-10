package PackageChapter11;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account(5, 5000);
		SavingsAccount save = new SavingsAccount(3, 2000);
		CheckingAccount check = new CheckingAccount(4, 1000, -10);

		account.setAnnualInterestRate(4.5);
		save.setAnnualInterestRate(4.5);
		check.setAnnualInterestRate(4.5);

		account.withdraw(1500);
		save.withdraw(1500);
		check.withdraw(1500);

		System.out.println(account.toString());
		System.out.println(check.toString());
		System.out.println(save.toString());
	}
}
