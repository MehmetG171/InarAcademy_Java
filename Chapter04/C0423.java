package PackageChapter04;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class C0423 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = input.next();
		System.out.println("Enter number of hours worked in a week:");
		double workHours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double federalTaxRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTaxRate = input.nextDouble();

		double GrossPay = payRate * workHours;
		double federal = (federalTaxRate * GrossPay);
		double state = (stateTaxRate * GrossPay);
		double total = federal + state;
		double net = GrossPay - total;
		double federalTaxRate1 = federalTaxRate * 100;
		double stateTaxRate1 = stateTaxRate * 100;

		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + workHours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.printf("Gross Pay: $%.2f\n", GrossPay);
		System.out.println("Deductions:");
		System.out.println("Federal Withholding (" + federalTaxRate1 + "%): $" + df.format(federal));
		System.out.println("State Withholding (" + stateTaxRate1 + "%): $" + df.format(state));
		System.out.printf("Total Deduction: $%.2f\n", total);
		System.out.printf("Net Pay: $%.2f", net);

		input.close();
	}
}
