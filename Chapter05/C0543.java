package PackageChapter05;

public class C0543 {
	public static void main(String[] args) {
		System.out.println("all possible combinations for picking two numbers from integers 1 to 7.");
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = i + 1; j <= 7; j++) {
				count++;
				System.out.print(i + " " + j + "   ");
				if (count % 3 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("The total number of all combinations is " + count);
	}
}
