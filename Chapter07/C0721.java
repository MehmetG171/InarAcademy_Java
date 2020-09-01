package PackageChapter07;

import java.util.Scanner;

public class C0721 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of balls to drop:");
		int numberOfBalls = input.nextInt();

		System.out.println("Enter the number of slots in the bean machine:");
		int numberOfSlots = input.nextInt();

		int[] slots = new int[numberOfSlots];
		for (int i = 0; i < slots.length; i++) {
			slots[i] = 0;
		}

		for (int j = 0; j < numberOfBalls; j++) {
			int numberOfRights = 0;

			for (int k = 0; k < slots.length - 1; k++) {
				int test = (int) (Math.random() * 2);
				if (test == 1) {
					System.out.print("R");
					numberOfRights++;
				} else {
					System.out.print("L");
				}

			}
			System.out.println("");
			slots[numberOfRights]++;
		}

		System.out.println("");

		int max = slots[0];
		for (int a = 0; a < slots.length; a++) {
			if (max < slots[a]) {
				max = slots[a];
			}
		}

		for (int f = max; 0 < f; f--) {
			for (int e = 0; e < slots.length; e++) {
				if (f <= slots[e]) {
					System.out.print("0");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		input.close();
	}
}
