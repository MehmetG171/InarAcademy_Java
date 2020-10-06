package PackageChapter10;

public class MyStringBuilder1 {

	private String str = "";

	public MyStringBuilder1(String s) {
		str = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		String newStr = str;
		newStr = newStr + s;
		return new MyStringBuilder1(newStr);
	}

	public MyStringBuilder1 append(int i) {
		String newStr = str;
		newStr = newStr + i + "";
		return new MyStringBuilder1(newStr);
	}

	public int length() {
		return str.length();
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				newStr = newStr + (char) (str.charAt(i) + 32);
			} else {
				newStr = newStr + str.charAt(i);
			}
		}
		return new MyStringBuilder1(newStr);
	}

	public String toString() {
		return str;
	}

	public MyStringBuilder1 substring(int begin, int end) {
		String newStr = "";
		for (int i = begin; i < end; i++) {
			newStr = newStr + str.charAt(i);
		}
		return new MyStringBuilder1(newStr);
	}
}
