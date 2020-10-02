package PackageChapter10;

public class BMI {

	private String name;
	private int age;
	private double weight;
	private double height;
	private double feet;
	private double inches;
	final static double KILOGRAMS_PER_POUND = 0.45359237;
	final static double METERS_PER_INCH = 0.0254;
	final static int INCH_PER_FOOT = 12;

	BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight * KILOGRAMS_PER_POUND;
	}

	public double getFeet() {
		return feet;
	}

	public double getInches() {
		return inches;
	}

	public double getHeight() {
		return height * METERS_PER_INCH;
	}

	double computeBMI() {
		double bmi = getWeight() / (getHeight() * getHeight());
		return bmi;
	}

	String Status() {
		if (computeBMI() < 18.5) {
			return "Underweight";
		} else if (computeBMI() < 25) {
			return "Normal";
		} else if (computeBMI() < 30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name, age, weight, feet * INCH_PER_FOOT + inches);
	}
}
