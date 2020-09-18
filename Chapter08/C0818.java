package PackageChapter08;

public class C0818 {

	public static void main(String[] args) {

		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		shuffle(m);

	}

	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int randIndex = (int) (Math.random() * 5);
			int temp1 = m[randIndex][0];
			int temp2 = m[randIndex][1];
			m[randIndex][0] = m[i][0];
			m[randIndex][1] = m[i][1];
			m[i][0] = temp1;
			m[i][1] = temp2;
		}

		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < 2; k++) {
				System.out.print(m[i][k] + " ");
			}
			System.out.println("");
		}
	}
}
