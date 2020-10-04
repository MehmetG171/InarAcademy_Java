package PackageChapter10;

public class MyString2 {

	private String str = "";

	public String getStr() {
		return str;
	}

	public MyString2(String s) {
		for (int i = 0; i < s.length(); i++) {
			this.str = this.str + s.charAt(i);
		}
	}

	public int compare(String s) {
		if (str.length() < s.length()) {
			return -1;
		}
		if (s.length() < str.length()) {
			return 1;
		}
		return 0;
	}

	public MyString2 substring(int begin) {
		String s = "";
		for (int i = begin; i < str.length(); i++) {
			s = s + str.charAt(i);
		}
		return new MyString2(s);
	}

	public MyString2 toUpperCase() {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				s = s + (char) (str.charAt(i) - 32);
			} else {
				s = s + str.charAt(i);
			}
		}
		return new MyString2(s);
	}

	public char[] toChars() {
		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		return chars;
	}

	public static MyString2 valueOf(boolean b) {
		if (b) {
			return new MyString2("true");
		}
		return new MyString2("false");
	}

}
