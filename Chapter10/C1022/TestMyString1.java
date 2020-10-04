package PackageChapter10;

public class TestMyString1 {

	public static void main(String[] args) {

		char[] array1 = { 'J', 'a', 'v', 'a', 'F', 'x', '1', '2' };
		char[] array2 = { 'J', 'A', 'v', 'a', 'f', 'x', '2' };

		MyString1 str1 = new MyString1(array1);
		MyString1 str2 = new MyString1(array2);

		System.out.println("Arrays:");

		System.out.print("array1 --> ");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("");

		System.out.print("array2 --> ");
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
		System.out.println("");

		int index = 4;
		System.out.println("Characters at index " + index + ":");
		System.out.println("array1 --> " + str1.charAt(4) + "  /  array2 --> " + str2.charAt(4));

		System.out.println("Length of arrays:");
		System.out.println("array1 --> " + str1.length() + "  /  array2 --> " + str2.length());

		System.out.println("Different substrings from arrays:");
		MyString1 newStr1 = str1.substring(3, 7);
		MyString1 newStr2 = str2.substring(0, 4);

		System.out.print("array1 --> ");
		for (int i = 0; i < newStr1.length(); i++) {
			System.out.print(newStr1.charAt(i));
		}
		System.out.println("");

		System.out.print("array2 --> ");
		for (int i = 0; i < newStr2.length(); i++) {
			System.out.print(newStr2.charAt(i));
		}
		System.out.println("");

		System.out.println("Converting arrays toLowerCase:");

		System.out.print("array1 --> ");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.toLowerCase().charAt(i));
		}
		System.out.println("");

		System.out.print("array2 --> ");
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.toLowerCase().charAt(i));
		}
		System.out.println("");

		System.out.println("Are the arrays equal ? " + str1.equals(str2));
		MyString1 a = str1.substring(0, 6).toLowerCase();
		MyString1 b = str2.substring(0, 6).toLowerCase();
		System.out.println("Are the LowerCase substrings from 0 to 6 equal ? " + a.equals(b));

	}
}
