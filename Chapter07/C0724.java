package PackageChapter07;

public class C0724 {

	public static void main(String[] args) {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int NumberOfPicks = 0;

		int a = (int) (Math.random() * 4);
		System.out.println(ranks[(int) (Math.random() * 13)] + " of " + suits[a]);
		NumberOfPicks++;

		int b = a;
		while (b == a) {
			b = (int) (Math.random() * 4);
			NumberOfPicks++;
		}
		System.out.println(ranks[(int) (Math.random() * 13)] + " of " + suits[b]);

		int c = b;
		while (c == b || c == a) {
			c = (int) (Math.random() * 4);
			NumberOfPicks++;
		}
		System.out.println(ranks[(int) (Math.random() * 13)] + " of " + suits[c]);

		int d = c;
		while (d == c || d == b || d == a) {
			d = (int) (Math.random() * 4);
			NumberOfPicks++;
		}
		System.out.println(ranks[(int) (Math.random() * 13)] + " of " + suits[d]);
		System.out.println("Number of picks: " + NumberOfPicks);
	}
}
