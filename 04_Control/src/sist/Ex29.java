package sist;

import java.util.Scanner;

/*
 * 1~100 사이의 정수 중에서
 * 키보드로 5개의 정수를 입력 받아서
 * 5개의 정수 중에서 최대값을 화면에 출력해 보자.
 */
public class Ex29 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = 0; // 최대값 변수
		int min = 0; // 최소값 변수
		int temp = 0;

		int su = 1; // 반복문 초기식

		while (su <= 5) {
			System.out.print(su + "번째 정수 입력 >>> ");
			temp = sc.nextInt();
			if (temp > max) {
				max = temp;
			}
			if (temp < min || min == 0) {
				min = temp;
			}
			su++;
		}

		System.out.println("최대값 >>> " + max);
		System.out.println("최소값 >>> " + min);

		sc.close();
	}
}
