package PackageChapter09;

public class TestFan {

	public static void main(String[] args) {

		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setColor("yellow");
		fan1.setOn(true);
		fan1.setRadius(10);
		fan1.setSpeed(fan1.FAST);

		fan2.getColor();
		fan2.isOn();
		fan2.getRadius();
		fan2.setSpeed(fan1.MEDIUM);

		System.out.println("Fan1--> " + fan1.toString());
		System.out.println("Fan2--> " + fan2.toString());

	}
}
