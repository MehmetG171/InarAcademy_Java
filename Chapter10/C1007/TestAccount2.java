package PackageChapter10;

import java.util.Scanner;

public class TestAccount2 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Account2[] account = new Account2[10];
		for (int i = 0; i < 10; i++) {
			account[i] = new Account2(i, 100.0);
		}

		System.out.println("Enter an id: ");
		int id = input.nextInt();

		while (true) {
			if (!isValid(id)) {
				System.out.println("Enter an id: ");
				id = input.nextInt();
			}
			menu();

			System.out.println("Enter a choice:");
			int choice = input.nextInt();

			if (choice == 4) {
				System.out.println("Enter an id: ");
				id = input.nextInt();

				if (!isValid(id)) {
					System.out.println("Enter an id: ");
					id = input.nextInt();
				}
			}

			performChoice(id, choice, account);
		}
	}

	private static boolean isValid(int id) {
		if (0 <= id && id < 10) {
			return true;
		}
		return false;
	}

	public static void performChoice(int id, int choice, Account2[] account) {
		switch (choice) {
		case 1:
			System.out.println("The balance is " + account[id].getBalance());
			break;
		case 2:
			System.out.println("Enter an amount to withdraw: ");
			double withdrawAmount = input.nextDouble();
			account[id].withdraw(withdrawAmount);
			break;
		case 3:
			System.out.println("Enter an amount to deposit: ");
			double depositAmount = input.nextDouble();
			account[id].deposit(depositAmount);
			break;
		default:
			break;
		}
	}

	public static void menu() {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}
}
