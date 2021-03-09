package Exam;

public class Rectangle {
	int width;
	int height;

	public Rectangle() {
	}

	public Rectangle(int a, int b) {
		width = a;
		height = b;
	}

	void area() {
		System.out.println("사각형의 넓이: " + (width * height));
	}

	void length() {
		System.out.println("사각형의 둘레: " + (2 * (width + height)));
	}
}
