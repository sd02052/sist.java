package sist;

import java.util.Scanner;

/*
 * [문제2] 1부터 사용자가 키보드로 입력한 수까지의 
 * 		홀수의 합과 짝수의 합을 구해 보자.
 */
public class Exam_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("수 입력: ");
		int num = sc.nextInt();

		int odd = 0, even = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				odd += i;
			} else {
				even += i;
			}
		}

		System.out.println("홀수합계: " + odd);
		System.out.println("짝수합계: " + even);
		sc.close();
	}
}
