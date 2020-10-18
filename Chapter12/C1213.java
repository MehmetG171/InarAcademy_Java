package PackageChapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1213 {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_13 filename");
			System.exit(1);
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		String s = "";
		int lines = 0;
		int characters = 0;
		int words = 0;

		try (Scanner input = new Scanner(file);) {
			while (input.hasNextLine()) {
				lines++;
				s = input.nextLine();
				characters = characters + s.length();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				s = input.next();
				words++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("File " + args[0] + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}
