package PackageChapter10;

public class MyStringBuilder2 {

	private String str;

	public MyStringBuilder2() {
		str = "";
	}

	public MyStringBuilder2(String s) {
		str = s;
	}

	public String toString() {
		return str;
	}

	public MyStringBuilder2(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			str = str + chars[i];
		}
	}

	public MyStringBuilder2 reverse() {
		String newStr = "";
		for (int i = str.length() - 1; 0 <= i; i--) {
			newStr = newStr + str.charAt(i);
		}
		return new MyStringBuilder2(newStr);
	}

	public MyStringBuilder2 substring(int begin) {
		String newStr = "";
		for (int i = begin; i < str.length(); i++) {
			newStr = newStr + str.charAt(i);
		}
		return new MyStringBuilder2(newStr);
	}

	public MyStringBuilder2 toUpperCase() {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				newStr = newStr + (char) (str.charAt(i) - 32);
			} else {
				newStr = newStr + str.charAt(i);
			}
		}
		return new MyStringBuilder2(newStr);
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String newStr = "";
		String newStr2 = "";
		for (int i = 0; i < offset; i++) {
			newStr = newStr + str.charAt(i);
		}
		for (int i = offset ; i < str.length(); i++) {
			newStr2 = newStr2 + str.charAt(i);
		}
		return new MyStringBuilder2(newStr + s.toString() + newStr2);
	}
}
