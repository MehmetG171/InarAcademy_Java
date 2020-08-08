package PackageChapter01;

public class C0111 {
	public static void main(String[] args) {

		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new immigrant every 45 seconds.");
		System.out.println("The current population is 312,032,486");

		int TotalSecondsInYear = 365 * 24 * 60 * 60;
		int TotalBirthInYear = TotalSecondsInYear / 7;
		int TotalDeathInYear = TotalSecondsInYear / 13;
		int TotalImmigrantInYear = TotalSecondsInYear / 45;
		int year1 = 312032486 + TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear;
		int year2 = year1 + TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear;
		int year3 = year2 + TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear;
		int year4 = year3 + TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear;
		int year5 = year4 + TotalImmigrantInYear + TotalBirthInYear - TotalDeathInYear;

		System.out.println("Year 1 = " + year1);
		System.out.println("Year 2 = " + year2);
		System.out.println("Year 3 = " + year3);
		System.out.println("Year 4 = " + year4);
		System.out.println("Year 5 = " + year5);
	}
}
