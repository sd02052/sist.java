package sist;

import java.util.Scanner;

public class Exam_03_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("별의 최대 갯수를 입력하세요 >>> ");
		int star = sc.nextInt();

		for (int i = 1; i <= (2 * star) - 1; i++) {
			int line = (i <= star) ? i : (star * 2 - i);

			for (int j = 1; j <= line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
