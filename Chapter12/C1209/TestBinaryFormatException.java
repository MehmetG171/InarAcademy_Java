package PackageChapter12;

import java.util.Scanner;

public class TestBinaryFormatException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String bin = input.nextLine();

		try {
			System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));
		} catch (BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		}

		input.close();
	}

	public static int bin2Dec(String binaryString) throws BinaryFormatException {
		int decimal = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new BinaryFormatException(binaryString);
			}
			decimal = decimal + Integer.parseInt(String.valueOf(binaryString.charAt(i)))
					* (int) Math.pow(2, binaryString.length() - i - 1);
		}
		return decimal;
	}
}
