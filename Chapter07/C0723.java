package PackageChapter07;

public class C0723 {

	public static void main(String[] args) {

		boolean[] lockers = new boolean[101];

		for (int i = 1; i < 101; i++) {
			lockers[i] = false;
		}

		for (int j = 1; j < 101; j++) {
			for (int k = 1; k < 101; k = k + j) {
				if (lockers[k] == false) {
					lockers[k] = true;
				} else {
					lockers[k] = false;
				}
			}
		}

		System.out.println("Open lockers are: ");

		for (int a = 1; a < 101; a++) {
			if (lockers[a] == true) {
				System.out.print(a - 1 + " ");
			}
		}
	}
}
