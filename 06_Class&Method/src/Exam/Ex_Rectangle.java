package Exam;

import java.util.Scanner;

public class Ex_Rectangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사각형의 가로, 세로를 입력하세요.");
		
		Rectangle rec = new Rectangle(sc.nextInt(), sc.nextInt());
		
		System.out.println("=====================================");
		
		rec.area();
		rec.length();
		
		sc.close();
	}
}
