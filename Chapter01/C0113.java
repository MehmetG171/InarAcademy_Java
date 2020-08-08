package PackageChapter01;

public class C0113 {
	public static void main(String[] args) {
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double e = 44.5;
		double f = 5.9;
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		System.out.println("Solving 2x2 linear equations (Cramer's rule)");
		System.out.println("ax + by = e  ;  cx + dy = f");
		System.out.println(" x = (ed - bf) / (ad - bc);");
		System.out.println(" y = (af - ec) / (ad - bc);");
		System.out.println("Example :  3.4x + 50.2y = 44.5  ;  2.1x + .55y = 5.9");
		System.out.println("x = " + x + "  " + "y = " + y);
	}
}
