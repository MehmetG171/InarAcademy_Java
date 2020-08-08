package PackageChapter01;

public class C0110 {
	public static void main(String[] args) {
		double x_km = 14.0;
		double x_miles = x_km / 1.6;
		double TotalSeconds = 45.0 * 60 + 30.0;
		double TotalHours = TotalSeconds / (60 * 60);
		double speed = x_miles / TotalHours;

		System.out.println("A runner runs 14 km in 45 minutes and 30 seconds.");
		System.out.println("Average speed in the unit of miles / hour is " + speed);
	}
}
