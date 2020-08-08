package PackageChapter03;

import java.util.Scanner;

public class C0317 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("scissor (0), rock (1), paper (2):");
		int pick = input.nextInt();

		int guess = (int) ((Math.random() * 10) % 3);

		System.out.print("The computer is ");

		switch (guess) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		default:
		}

		System.out.print(" You are ");

		switch (pick) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		default:
		}

		if ((pick == 0 && guess == 2) || (pick == 1 && guess == 0) || (pick == 2 && guess == 1)) {
			System.out.print(" You won.");
		} else if ((guess == 0 && pick == 2) || (guess == 1 && pick == 0) || (guess == 2 && pick == 1)) {
			System.out.print(" Computer won.");
		} else {
			System.out.print(" It is a draw.");
		}

		input.close();
	}
}
