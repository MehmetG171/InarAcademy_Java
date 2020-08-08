package PackageChapter04;

public class C0406 {

	public static void main(String[] args) {

		final double radius = 40;
		double p1x1 = radius * Math.cos(Math.toRadians(Math.random() * 360));
		double p1y1 = radius * Math.sin(Math.toRadians(Math.random() * 360));
		double p2x2 = radius * Math.cos(Math.toRadians(Math.random() * 360));
		double p2y2 = radius * Math.sin(Math.toRadians(Math.random() * 360));
		double p3x3 = radius * Math.cos(Math.toRadians(Math.random() * 360));
		double p3y3 = radius * Math.sin(Math.toRadians(Math.random() * 360));

		double csquare = Math.pow(p1x1 - p2x2, 2) + Math.pow(p1y1 - p2y2, 2);
		double asquare = Math.pow(p2x2 - p3x3, 2) + Math.pow(p2y2 - p3y3, 2);
		double bsquare = Math.pow(p3x3 - p1x1, 2) + Math.pow(p3y3 - p1y1, 2);

		double c = Math.pow(csquare, 0.5);
		double a = Math.pow(asquare, 0.5);
		double b = Math.pow(bsquare, 0.5);

		double angleA = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double angleB = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double angleC = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

		double angleAvalue = Math.toDegrees(angleA);
		double angleBvalue = Math.toDegrees(angleB);
		double angleCvalue = Math.toDegrees(angleC);

		System.out.printf("The angles of triangle are:\n%.2f\n%.2f\n%.2f\n ", angleAvalue, angleBvalue, angleCvalue);

	}
}
