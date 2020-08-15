package PackageChapter05;

import java.util.Scanner;

public class C0534 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int user = 0;
		int computer = 0;
		String Computer = "";
		String User = "";

		while ((computer != user + 3) && (user != computer + 3)) {

			System.out.println("scissor (0), rock (1), paper (2):");
			int pick = input.nextInt();

			int guess = (int) ((Math.random() * 10) % 3);
			Computer = guesschoice(guess);
			User = pickchoice(pick);
			System.out.println("The computer is " + Computer + ". You are " + User + ".");

			if ((pick == 0 && guess == 2) || (pick == 1 && guess == 0) || (pick == 2 && guess == 1)) {
				System.out.println("You won.");
				user++;
			} else if ((guess == 0 && pick == 2) || (guess == 1 && pick == 0) || (guess == 2 && pick == 1)) {
				System.out.println("Computer won.");
				computer++;
			} else {
				System.out.println("It is a draw.");
			}
		}

		if (computer < user) {
			System.out.println("Final scores:");
			System.out.println("Computer: " + computer + "  User: " + user);
			System.out.println("You won in total!!!");
		} else {
			System.out.println("Final scores:");
			System.out.println("Computer: " + computer + "  User: " + user);
			System.out.println("Computer won in total!!!");
		}

		input.close();
	}

	public static String pickchoice(int pick) {
		String Pick = "";
		switch (pick) {
		case 0:
			Pick = Pick + "scissor";
			break;
		case 1:
			Pick = Pick + "rock";
			break;
		case 2:
			Pick = Pick + "paper";
			break;
		default:
		}
		return Pick;
	}

	public static String guesschoice(int guess) {
		String Guess = "";
		switch (guess) {
		case 0:
			Guess = Guess + "scissor";
			break;
		case 1:
			Guess = Guess + "rock";
			break;
		case 2:
			Guess = Guess + "paper";
			break;
		default:
		}
		return Guess;
	}
}
