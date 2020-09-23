package PackageChapter08;

import java.util.Scanner;

public class C0837 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] capitals = { { "Turkey", "Ankara" }, { "England", "London" }, { "Norway", "Oslo" },
				{ "Germany", "Berlin" }, { "Russia", "Moscow" }, { "Egypt", "Cairo" }, { "Japan", "Tokyo" },
				{ "Australia", "Melbourne" }, { "Greece", "Athens" }, { "Kazakhistan", "Astana" } };

		int correct = 0;
		int question = 0;

		while (question < capitals.length) {
			System.out.println("What is the capital of " + capitals[question][0] + "?");
			String answer = input.nextLine();

			String newCapital = capitals[question][1].toLowerCase();
			String newAnswer = answer.toLowerCase();

			if (newCapital.equals(newAnswer)) {
				System.out.println("Your answer is correct");
				correct++;
			} else {
				System.out.println("The correct answer should be " + capitals[question][1]);
			}

			question++;
		}

		System.out.println("The correct count is " + correct);

		input.close();
	}
}
