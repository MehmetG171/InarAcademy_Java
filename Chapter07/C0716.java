package PackageChapter07;

public class C0716 {

	public static void main(String[] args) {
		int key = (int) (Math.random() * 100000);

		int[] numbers = new int[100000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100000);
		}

		long startTime = System.currentTimeMillis();
		int situation1 = linearSearch(numbers, key);
		if (situation1 == -1) {
			System.out.println("The key value couldn't found.");
		} else {
			System.out.println("The number has found.");
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("The linear search took " + executionTime + " milliseconds");

		SelectionSort(numbers);

		startTime = System.currentTimeMillis();
		int situation2 = binarySearch(numbers, key);
		if (situation2 == -1) {
			System.out.println("The key value couldn't found.");
		} else {
			System.out.println("The number has found.");
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("The binary search took " + executionTime + " milliseconds");
	}

	public static int linearSearch(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (key == numbers[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < numbers[mid]) {
				high = mid - 1;
			} else if (key == numbers[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void SelectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int CurrentMax = numbers[i];
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
