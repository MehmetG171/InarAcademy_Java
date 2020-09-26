package PackageChapter09;

public class TestStopWatch {
	
	public static void main(String[] args) {

		double[] array = new double[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 100000);
		}

		StopWatch test = new StopWatch();

		SelectionSort(array);
		test.stop();

		System.out.println("The execution time of sorting 100,000 numbers is ");
		System.out.println(test.getElapsedTime() + " milliseconds");
	}

	public static void SelectionSort(double[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			double CurrentMax = numbers[i];
			int CurrentMaxIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (CurrentMax <= numbers[j]) {
					CurrentMax = numbers[j];
					CurrentMaxIndex = j;
				}
			}

			if (CurrentMaxIndex != i) {
				numbers[CurrentMaxIndex] = numbers[i];
				numbers[i] = CurrentMax;
			}
		}
	}
}
