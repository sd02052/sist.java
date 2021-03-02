package sist;

/*
 * [문제3] 다중 for문 예제
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Exam_03_01 {
	public static void main(String[] args) {
		// 1. 올라가는 별 찍기
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2. 내려가는 별 찍기
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
