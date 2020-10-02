package PackageChapter10;

public class TestMyInteger {

	public static void main(String[] args) {

		MyInteger my1 = new MyInteger(27);
		MyInteger my2 = new MyInteger(11);
		MyInteger my3 = new MyInteger(2);

		System.out.println(my1.getValue() + " is even? " + my1.isEven());
		System.out.println(my2.getValue() + " is even? " + my2.isEven());
		System.out.println(my3.getValue() + " is even? " + my3.isEven());
		System.out.println("");

		System.out.println(my1.getValue() + " is odd? " + my1.isOdd());
		System.out.println(my2.getValue() + " is odd? " + my2.isOdd());
		System.out.println(my3.getValue() + " is odd? " + my3.isOdd());
		System.out.println("");

		System.out.println(my1.getValue() + " is prime? " + my1.isPrime());
		System.out.println(my2.getValue() + " is prime? " + my2.isPrime());
		System.out.println(my3.getValue() + " is prime? " + my3.isPrime());
		System.out.println("");

		System.out.println("Is " + my1.getValue() + " equals to " + my2.getValue() + "? " + my1.equals(my2.getValue()));
		System.out.println("Is " + my2.getValue() + " equals to " + my3.getValue() + "? " + my2.equals(my3.getValue()));
		System.out.println("Is " + my3.getValue() + " equals to " + my1.getValue() + "? " + my3.equals(my1.getValue()));
		System.out.println("");

		char[] ch = { '1', '2', '3', '4' };
		System.out.println(MyInteger.parseInt(ch));

		String str = "192837465";
		System.out.println(MyInteger.parseInt(str));
	}
}
