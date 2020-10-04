package PackageChapter10;

public class MyCharacter {

	char ch;

	public MyCharacter(char ch) {
		this.ch = ch;
	}

	public char getChar() {
		return ch;
	}

	public char toUpperCase(char a) {
		return Character.toUpperCase(a);
	}

	public char toLowerCase(char a) {
		return Character.toLowerCase(a);
	}

	public boolean isDigit(char a) {
		return Character.isDigit(a);
	}

	public boolean isLetter(char a) {
		return Character.isLetter(a);
	}

	public int valueOf(char a) {
		return Character.getNumericValue(a);
	}

	public int compare(char a) {
		return Character.compare(ch, a);
	}

	public boolean equals(char a) {
		return (ch == a) ? true : false;
	}

	public boolean isUpperCase(char a) {
		return Character.isUpperCase(a);
	}

	public boolean isLowerCase(char a) {
		return Character.isLowerCase(a);
	}
}
