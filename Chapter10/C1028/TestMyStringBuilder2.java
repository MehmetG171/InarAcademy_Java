package PackageChapter10;

public class TestMyStringBuilder2 {

	public static void main(String[] args) {

		String str = "Welcome to Java";
		MyStringBuilder2 builder = new MyStringBuilder2(str);

		System.out.println("The string --> " + builder.toString());

		String insStr = "HTML and ";
		int offset = 11;
		MyStringBuilder2 builder2 = new MyStringBuilder2(insStr);
		System.out.println("Inserting a new string --> " + builder.insert(offset, builder2));

		System.out.println("Reverse of the string --> " + builder.reverse());
		System.out.println("String toUpperCase --> " + builder.toUpperCase());

		int begin = 3;
		System.out.println("Substring from index " + begin + " to end --> " + builder.substring(begin));
	}
}
