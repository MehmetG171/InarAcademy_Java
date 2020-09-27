package PackageChapter09;

public class QuadraticEquation {

	double a, b, c;

	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}
	
	

}
