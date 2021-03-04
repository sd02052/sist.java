package sist;

import java.util.Scanner;

/*
 * [문제1] 배열의 크기를 키보드로 입력을 받고
 * 		입력받은 배열의 크기만큼 키보드로 정수를
 * 		입력받아서 최대값과 최소값을 화면에 출력해 보세요.
 */
public class Exam_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기 입력 >>>");

		int[] arr = new int[sc.nextInt()];

		int max = 0, min = 99;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 값 입력: ");
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("최대값 >>> " + max);
		System.out.println("최소값 >>> " + min);

		sc.close();
	}
}
