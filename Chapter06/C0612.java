package PackageChapter06;

public class C0612 {
	public static void main(String[] args) {
		int NumberPerLine = 10;
		char ch1 = 49;
		char ch2 = 90;
		printChars(ch1, ch2, NumberPerLine);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for (int i = ch1; i <= ch2; i++) {
			System.out.print((char) i + " ");
			if ((i - 48) % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
