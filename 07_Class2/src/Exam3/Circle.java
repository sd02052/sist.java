package Exam3;

public class Circle implements Shape {
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double findArea() {
		return 3.14 * radius * radius;
	}

}
