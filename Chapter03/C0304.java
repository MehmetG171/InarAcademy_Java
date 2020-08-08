package PackageChapter03;

public class C0304 {
	public static void main(String[] args) {

		int number = (int) (System.currentTimeMillis() % 12) + 1;

		switch (number) {
		case 1:
			System.out.println("1. month is January");
			break;
		case 2:
			System.out.println("2. month is February");
			break;
		case 3:
			System.out.println("3. month is March");
			break;
		case 4:
			System.out.println("4. month is April");
			break;
		case 5:
			System.out.println("5. month is May");
			break;
		case 6:
			System.out.println("6. month is June");
			break;
		case 7:
			System.out.println("7. month is July");
			break;
		case 8:
			System.out.println("8. month is August");
			break;
		case 9:
			System.out.println("9. month is September");
			break;
		case 10:
			System.out.println("10. month is October");
			break;
		case 11:
			System.out.println("11. month is November");
			break;
		case 12:
			System.out.println("12. month is December");
			break;
		default:
		}
	}
}
