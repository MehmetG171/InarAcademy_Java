package PackageChapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C1211 {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Usage: java Exercise12_11 John filename");
			System.exit(1);
		}

		File file = new File(args[1]);
		
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}

		String str = "";

		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				str = str + input.next();
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		str = str.replaceAll(args[0], "");

		try {
			PrintWriter writer = new PrintWriter(args[1]);
			System.out.println(str);
			writer.write(str);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
