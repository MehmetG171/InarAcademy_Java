package PackageChapter09;

public class Fan {

	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;

	private int speed = SLOW;
	private boolean on;
	private double radius = 5;
	String color = "blue";

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	Fan() {
	}

	public String toString() {
		String combined = "";

		if (on) {
			combined = "Speed: " + speed + " / Color:  " + color + " / Radius: " + radius;
		} else {
			combined = "Color:  " + color + " / Radius: " + radius + " (fan is off)";
		}

		return combined;
	}
}
