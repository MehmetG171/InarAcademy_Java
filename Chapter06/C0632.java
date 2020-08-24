package PackageChapter06;

public class C0632 {

	public static void main(String[] args) {
		System.out.println("Game: chance of winning at craps");
		System.out.println("Rolling two dice for 10000 times:");
		Action();
	}

	public static void Action() {
		int i = 0;
		int win = 0;
		int lose = 0;
		while (i < 10000) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			int total = a + b;
			i++;
			if ((total == 7) || (total == 11)) {
				win++;
			} else if ((total == 2) || (total == 3) || (total == 12)) {
				lose++;
			} else {
				int point = a + b;

				int sum = -1;
				while ((sum != 7) && (sum != point)) {
					a = (int) (Math.random() * 6) + 1;
					b = (int) (Math.random() * 6) + 1;
					sum = a + b;
					i++;
				}
				if (sum == 7) {
					lose++;
				} else {
					win++;
				}
			}
		}
		System.out.printf("Wins: %d   Losses: %d\n", win, lose);
		System.out.printf("Chance of winning at craps: %%%.3f", 100 * win / 10000.0);
	}
}
