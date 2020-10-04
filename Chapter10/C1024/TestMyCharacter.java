package PackageChapter10;

public class TestMyCharacter {

	public static void main(String[] args) {

		char ch = 'a';
		MyCharacter my = new MyCharacter(ch);

		System.out.println("Test character is '" + my.getChar() + "'");
		System.out.println("toUpperCase --> " + my.toUpperCase(ch));
		System.out.println("toLowerCase --> " + my.toLowerCase(ch));
		System.out.println("isDigit --> " + my.isDigit(ch));
		System.out.println("isLetter --> " + my.isLetter(ch));
		System.out.println("isUpperCase --> " + my.isUpperCase(ch));
		System.out.println("isLowerCase --> " + my.isLowerCase(ch));
		System.out.println("valueOf --> " + my.valueOf(ch));
		System.out.println("equals to 'b' ? --> " + my.equals('b'));

		System.out.print("compare to 'b' (w.r.t. ASCII values) --> ");
		if (my.compare('b') < 0) {
			System.out.println("b is greater than " + my.getChar());
		} else if (my.compare('b') > 0) {
			System.out.println("b is smaller than " + my.getChar());
		} else {
			System.out.println("b is identical to " + my.getChar());
		}
	}
}
