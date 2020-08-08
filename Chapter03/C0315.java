package PackageChapter03;

import java.util.Scanner;

public class C0315 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lottery = (int) (Math.random() * 1000);

		System.out.println("Enter your lottery pick (three digits):");
		int guess = input.nextInt();

		int guessYuzler = guess / 100;
		int guessOnlar = (guess / 10) % 10;
		int guessBirler = guess % 10;

		int lotteryYuzler = lottery / 100;
		int lotteryOnlar = (lottery / 10) % 10;
		int lotteryBirler = lottery % 10;

		System.out.println("The lottery number is " + lottery);

		if (guess == lottery) {

			System.out.println("Exact match: you win $10,000");

		} else if ((lotteryYuzler == guessYuzler && lotteryOnlar == guessBirler && lotteryBirler == guessOnlar)
				|| (lotteryYuzler == guessOnlar && lotteryOnlar == guessBirler && lotteryBirler == guessYuzler)
				|| (lotteryYuzler == guessOnlar && lotteryOnlar == guessYuzler && lotteryBirler == guessBirler)
				|| (lotteryYuzler == guessBirler && lotteryOnlar == guessOnlar && lotteryBirler == guessYuzler)
				|| (lotteryYuzler == guessBirler && lotteryOnlar == guessYuzler && lotteryBirler == guessOnlar)) {

			System.out.println("Match all digits: you win $3,000");

		} else if (lotteryYuzler == guessYuzler || lotteryYuzler == guessOnlar || lotteryYuzler == guessBirler
				|| lotteryOnlar == guessYuzler || lotteryOnlar == guessOnlar || lotteryOnlar == guessBirler
				|| lotteryBirler == guessYuzler || lotteryBirler == guessOnlar || lotteryBirler == guessBirler) {

			System.out.println("Match one digit: you win $1,000");

		} else {
			System.out.println("Sorry, no match");
		}

		input.close();
	}
}
