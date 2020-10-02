package PackageChapter10;

public class MyInteger {

	int value;

	MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	boolean isEven() {
		if (value % 2 != 0) {
			return false;
		}
		return true;
	}

	boolean isOdd() {
		if (value % 2 != 1) {
			return false;
		}
		return true;
	}

	boolean isPrime() {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int num) {
		if (num % 2 != 0) {
			return false;
		}
		return true;
	}

	static boolean isOdd(int num) {
		if (num % 2 != 1) {
			return false;
		}
		return true;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger num) {
		return num.isEven();
	}

	static boolean isOdd(MyInteger num) {
		return num.isOdd();
	}

	static boolean isPrime(MyInteger num) {
		return num.isPrime();
	}

	boolean equals(int num) {
		if (num != value) {
			return false;
		}
		return true;
	}

	boolean equals(MyInteger num) {
		return num.equals(num);
	}

	static int parseInt(char[] ch) {
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum = sum + Character.getNumericValue(ch[i]);
		}
		return sum;
	}

	static int parseInt(String str) {
		return Integer.parseInt(str);
	}

}
