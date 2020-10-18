package PackageChapter12;

public class C1201 {

	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		if (!(isNumeric(args[0]))) {
			System.out.println("Error \"" + args[0] + "\" is not numeric.");
			System.exit(1);
		}

		if (!(isNumeric(args[2]))) {
			System.out.println("Error \"" + args[2] + "\" is not numeric.");
			System.exit(2);
		}

		int result = 0;

		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

	public static boolean isNumeric(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

}
