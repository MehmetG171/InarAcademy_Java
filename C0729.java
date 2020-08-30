package PackageChapter07;

public class C0729 {

	public static void main(String[] args) {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int total = -1;
		int NumberOfPicks = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		while (total != 24) {
			total = 0;
			for (int i = 0; i < 4; i++) {
				int number = (int) (Math.random() * 13 + 1);
				total = total + number;

				if (i == 0) {
					a = number;
				}
				if (i == 1) {
					b = number;
				}
				if (i == 2) {
					c = number;
				}
				if (i == 3) {
					d = number;
				}
			}
			NumberOfPicks++;
		}
		System.out.println(ranks[a - 1] + " of " + suits[(int) (Math.random() * 4)]);
		System.out.println(ranks[b - 1] + " of " + suits[(int) (Math.random() * 4)]);
		System.out.println(ranks[c - 1] + " of " + suits[(int) (Math.random() * 4)]);
		System.out.println(ranks[d - 1] + " of " + suits[(int) (Math.random() * 4)]);
		System.out.println("Number of picks: " + NumberOfPicks);

	}
}
