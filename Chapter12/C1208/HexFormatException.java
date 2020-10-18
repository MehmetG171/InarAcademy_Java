package PackageChapter12;

@SuppressWarnings("serial")
public class HexFormatException extends Exception {

	private String str;

	public String getStr() {
		return str;
	}

	public HexFormatException(String str) {
		super(str + " isn't a hex string");
		this.str = str;
	}
}
