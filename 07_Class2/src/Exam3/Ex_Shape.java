package Exam3;

import java.util.Scanner;

public class Ex_Shape {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("도형을 선택하세요. (1. 원형, 2. 사각형)");
		int sel = sc.nextInt();
		System.out.println("도형선택=> " + sel);
		if (sel == 1) {
			System.out.print("반지름 입력=> ");
			Circle circle = new Circle(sc.nextInt());
			System.out.println("=================================");
			System.out.println("원이 면적: " + circle.findArea());
		} else if (sel == 2) {
			Rectangle rectangle = new Rectangle();
			System.out.print("가로=> ");
			rectangle.setWidth(sc.nextInt());
			System.out.print("세로=> ");
			rectangle.setHeight(sc.nextInt());
			System.out.println("=================================");
			System.out.println("사각형의 면적: " + rectangle.findArea());
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();
	}
}
