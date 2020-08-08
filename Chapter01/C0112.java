package PackageChapter01;

public class C0112 {
	public static void main(String[] args) {
		double x_miles = 24.0;
		double x_km = x_miles * 1.6;
		double TotalSeconds = 1.0 * 60 * 60 + 40.0 * 60 + 35;
		double TotalHours = TotalSeconds / (60 * 60);
		double speed = x_km / TotalHours;
		System.out.println("A runner runs 24 miles in 1 hour, 40 minutes and 35 seconds.");
		System.out.println("Average speed in the unit of km / hour is " + speed);
	}
}
