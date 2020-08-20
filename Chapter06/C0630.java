package PackageChapter06;

public class C0630 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		int total = a + b;
		if ((total == 7) || (total == 11)) {
			System.out.printf("You rolled %d + %d = %d\n", a, b, a + b);
			System.out.printf("You win\n");
		} else if ((total == 2) || (total == 3) || (total == 12)) {
			System.out.printf("You rolled %d + %d = %d\n", a, b, a + b);
			System.out.printf("You lose\n");
		} else {
			int point = a + b;
			System.out.printf("You rolled %d + %d = %d\n", a, b, a + b);
			System.out.printf("The point is %d\n", point);
			Craps(a, b, point);
		}
	}

	public static void Craps(int a, int b, int point) {
		int sum = -1;
		while ((sum != 7) && (sum != point)) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			sum = a + b;
			System.out.printf("You rolled %d + %d = %d\n", a, b, sum);
		}
		if (sum == 7) {
			System.out.printf("You lose\n");
		} else {
			System.out.printf("You win\n");
		}
	}
}
