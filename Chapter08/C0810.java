package PackageChapter08;

public class C0810 {

	public static void main(String[] args) {

		int[][] binary = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				binary[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(binary[i][j]);
			}
			System.out.println("");
		}

		int biggestRow = 0;
		for (int i = 0; i < 4; i++) {
			int totalRow = 0;
			for (int j = 0; j < 4; j++) {
				totalRow = binary[i][j] + totalRow;
				if (totalRow > biggestRow) {
					biggestRow = totalRow;
				}
			}
		}

		int biggestColumn = 0;
		for (int j = 0; j < 4; j++) {
			int totalColumn = 0;
			for (int i = 0; i < 4; i++) {
				totalColumn = binary[i][j] + totalColumn;
				if (totalColumn > biggestColumn) {
					biggestColumn = totalColumn;
				}
			}
		}

		System.out.println("The largest row index: ");
		for (int k = 0; k < 4; k++) {
			int total = 0;
			for (int m = 0; m < 4; m++) {
				total = binary[k][m] + total;
			}
			if (total == biggestRow) {
				System.out.print(k + " ");
			}
		}

		System.out.println("");

		System.out.println("The largest column index: ");
		for (int k = 0; k < 4; k++) {
			int total = 0;
			for (int m = 0; m < 4; m++) {
				total = binary[m][k] + total;
			}
			if (total == biggestColumn) {
				System.out.print(k + " ");
			}
		}

	}

}
