package PackageChapter12;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class C1207 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String bin = input.nextLine();

		try {
			System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));
		} catch (NumberFormatException ex) {
			System.out.println("Error! Invalid binary number");
		}

		input.close();
	}

	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int decimal = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new NumberFormatException();
			}
			decimal = decimal + Integer.parseInt(String.valueOf(binaryString.charAt(i)))
					* (int) Math.pow(2, binaryString.length() - i - 1);
		}
		return decimal;
	}
}
