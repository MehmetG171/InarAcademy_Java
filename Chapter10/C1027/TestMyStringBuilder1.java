package PackageChapter10;

public class TestMyStringBuilder1 {

	public static void main(String[] args) {

		String str = "JavA iS Fun";
		MyStringBuilder1 builder = new MyStringBuilder1(str);

		System.out.println("The string --> " + builder.toString());

		String append = " as aLwayS";
		MyStringBuilder1 builder2 = new MyStringBuilder1(append);
		System.out.println("Appending a new string --> " + builder.append(builder2));

		int number = 2;
		System.out.println("Appending a new number -->  " + builder.append(number));

		System.out.println("Length of the string --> " + builder.length());

		int index = 5;
		System.out.println("Character at index " + index + " --> '" + builder.charAt(index) + "'");

		System.out.println("String toLowerCase --> " + builder.toLowerCase());

		int begin = 3;
		int end = 6;
		System.out.println(
				"Substring from index " + begin + " to index " + end + " --> " + builder.substring(begin, end));

	}
}
