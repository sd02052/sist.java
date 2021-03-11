package inheritance;

public class Point3D extends Point {

	int z;

	public Point3D() {
	}

	public Point3D(int x, int y) {
		super(x, y);
	}

	public Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;

		this(x, y);
		this.z = z;
	}

	void output() {
		System.out.println("x좌표: " + x);
		System.out.println("y좌표: " + y);
		System.out.println("z좌표: " + z);
	}

}
