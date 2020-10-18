package PackageChapter12;

@SuppressWarnings("serial")
public class BinaryFormatException extends Exception {

	private String str;

	public String getStr() {
		return str;
	}

	public BinaryFormatException(String str) {
		super(str + " isn't a binary string");
		this.str = str;
	}
}
