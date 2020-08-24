package PackageChapter06;

public class C0638 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			char ch = getRandomUpperCaseLetter();
			System.out.print(ch + " ");
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
		System.out.printf("\n\n");

		for (int j = 1; j <= 100; j++) {
			char ch1 = getRandomDigitCharacter();
			System.out.print(ch1 + " ");
			if (j % 10 == 0) {
				System.out.println("");
			}
		}
	}

	public static char getRandomDigitCharacter() {
		char ch1 = (char) ((int) (Math.random() * 26) + 65);
		return ch1;
	}

	public static char getRandomUpperCaseLetter() {
		char ch = (char) ((int) (Math.random() * 10) + 48);
		return ch;
	}
}
