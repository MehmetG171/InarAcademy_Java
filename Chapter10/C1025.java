package PackageChapter10;

public class C1025 {

	public static void main(String[] args) {

		String str = "ab#12#453";
		String regex = "#";

		String[] a = split(str, regex);
		PrintText(str, regex);
		PrintArray(a);
	}

	public static void PrintText(String str, String regex) {
		System.out.println("String is \"" + str + "\"");
		System.out.println("Regex is \"" + regex + "\"");
		System.out.print("Splitted string is \"");
	}

	public static void PrintArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.print(a[i] + "\"");
			}
		}
	}

	public static String[] split(String s, String regex) {

		int size = GetSizeOfStringArray(s, regex);
		String[] a = new String[size * 2 + 1];

		int count = 0;
		int count2 = 0;
		String str = "";
		while (count < s.length()) {
			if (regex.equals(Character.toString(s.charAt(count)))) {
				count2++;
				a[count2 - 1] = str;
				count2++;
				a[count2 - 1] = regex;
				str = "";
			} else {
				str = str + Character.toString(s.charAt(count));
			}
			count++;
			if (count == s.length() - 1) {
				str = str + Character.toString(s.charAt(count));
				a[a.length - 1] = str;
			}
		}
		return a;
	}

	public static int GetSizeOfStringArray(String s, String regex) {
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			if (regex.equals(Character.toString(s.charAt(i)))) {
				size++;
			}
		}
		return size;
	}
}
