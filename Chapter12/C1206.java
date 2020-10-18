package PackageChapter12;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class C1206 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		try {
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException ex) {
			System.out.println("Error! Invalid hex number");
		}

		input.close();
	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if ((0 <= hex.charAt(i) && hex.charAt(i) <= 47) || (58 <= hex.charAt(i) && hex.charAt(i) <= 64)
					|| (71 <= hex.charAt(i) && hex.charAt(i) <= 127)) {
				throw new NumberFormatException();
			}
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}
	}
}
