package sist;

import java.util.Scanner;

/*
 * [문제1] 지방(fat), 탄수화물(car), 단백질(protein)
 * 		칼로리의 합계를 구하는 프로그램 작성
 * 		* 총 갈로리: (지방*9) + (탄수화물*4) + (단백질*4)
 */

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("지방의 그램을 입력하세요 >>> ");
		int fat = sc.nextInt();

		System.out.print("탄수화물의 그램을 입력하세요 >>> ");
		int car = sc.nextInt();

		System.out.print("단백질의 그램을 입력하세요 >>> ");
		int protein = sc.nextInt();

		// 총 갈로리: (지방*9) + (탄수화물*4) + (단백질*4)
		int total = (fat * 9) + (car * 4) + (protein * 4);

		System.out.printf("총 칼로리 >>> %,d cal\n", total);

		sc.close();
	}
}
