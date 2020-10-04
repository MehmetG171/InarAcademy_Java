package PackageChapter10;

public class TestMyString2 {

	public static void main(String[] args) {

		MyString2 str1 = new MyString2("JavAFx123");
		MyString2 str2 = new MyString2("JaVAFx13");

		System.out.println("str1 --> " + str1.getStr());
		System.out.println("str2 --> " + str2.getStr());

		System.out.print("Comparism: ");
		int compare = str1.compare(str2.getStr());
		if (compare < 0) {
			System.out.println("str2 is longer than str1.");
		} else if (0 < compare) {
			System.out.println("str1 is longer than str2.");
		} else {
			System.out.println("The length of str1 and str2 are equal.");
		}

		int index1 = 5;
		int index2 = 4;
		System.out.println("A substring of str1 with the beginning index " + index1 + ":");
		System.out.println(str1.substring(index1).getStr());
		System.out.println("A substring of str2 with the beginning index " + index2 + ":");
		System.out.println(str2.substring(index2).getStr());

		System.out.println("str1 toUpperCase --> " + str1.toUpperCase().getStr());
		System.out.println("str2 toUpperCase --> " + str2.toUpperCase().getStr());

		System.out.print("Testing valueOf method --> ");
		System.out.print(MyString2.valueOf(false).getStr() + ", ");
		System.out.print(MyString2.valueOf(true).getStr());
	}
}
