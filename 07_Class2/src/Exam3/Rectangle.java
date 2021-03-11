package Exam3;

public class Rectangle implements Shape {

	int height;
	int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle() {
	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double findArea() {
		return height * width;
	}
}
