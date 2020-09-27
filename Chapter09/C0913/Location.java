package PackageChapter09;

public class Location {

	private int row;
	private int column;
	private double maxValue;

	Location(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public double getMaxValue() {
		return maxValue;
	}

}
