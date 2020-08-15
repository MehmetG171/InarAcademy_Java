package PackageChapter05;

public class C0540 {
	public static void main(String[] args) {

		System.out.println("Simulation: heads or tails");
		int heads = 0;
		int tails = 0;

		for (int i = 1; i <= 1000000; i++) {
			int random = (int) (Math.random() * 2);
			if (random == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads = " + heads + "  Tails = " + tails);
	}
}
