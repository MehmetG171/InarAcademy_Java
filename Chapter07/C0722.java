package PackageChapter07;

public class C0722 {
	public static void main(String[] args) {

		int[] numbers = new int[9];
		int a = 0;
		int random = (int) (Math.random() * 8 + 1);

		for (int i = 0; i < 8; i++) {

			while (contains(numbers, random)) {
				random = (int) (Math.random() * 8 + 1);
			}
			numbers[a] = random;
			if (a < 9) {
				a++;
			}

			System.out.println("");

			for (int j = 0; j <= 8; j++) {
				if (random == j) {
					System.out.print("Q|");
				} else {
					System.out.print(" |");
				}
			}
		}
	}

	public static boolean contains(int[] numbers, int i) {
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == i) {
				return true;
			}
		}
		return false;
	}
}
