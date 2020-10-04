package PackageChapter10;

public class MyString1 {

	private char[] chars;

	public MyString1(char[] chars) {

		this.chars = new char[chars.length];

		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 toLowerCase() {
		char[] chars2 = new char[chars.length];

		for (int i = 0; i < chars.length; i++) {
			if ('A' <= chars[i] && chars[i] <= 'Z') {
				chars2[i] = (char) (chars[i] + 32);
			} else {
				chars2[i] = chars[i];
			}
		}

		return new MyString1(chars2);
	}

	public boolean equals(MyString1 s) {

		if (chars.length != s.length()) {
			return false;
		}

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != s.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public MyString1 substring(int begin, int end) {
		char[] chars2 = new char[end - begin];
		int countChars2 = 0;
		int countChars = begin;

		while (countChars < end) {
			chars2[countChars2] = chars[countChars];
			countChars++;
			countChars2++;
		}

		return new MyString1(chars2);
	}
}
