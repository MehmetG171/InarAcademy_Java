package PackageChapter12;

import java.util.*;
import java.io.*;

public class C1216 {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 3) {
			System.out.println("Usage: java Exercise12_16 file oldString newString");
			System.exit(1);
		}

		File file = new File(args[0]);
		
		if (!file.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		String s = "";

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				s = s + input.nextLine();
			}
		}

		s = s.replaceAll(args[1], args[2]);

		try {
			PrintWriter output = new PrintWriter(file);
			output.write(s);
			output.println(s);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
