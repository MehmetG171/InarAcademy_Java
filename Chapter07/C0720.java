package PackageChapter07;

import java.util.Scanner;

public class C0720 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integers:");

		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		SelectionSort(numbers);
		System.out.println("The sorted integers are: ");
		for (int j = numbers.length - 1; 0 <= j; j--) {
			System.out.print(numbers[j] + " ");
		}

		input.close();
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
