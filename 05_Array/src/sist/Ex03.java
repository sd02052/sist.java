package sist;

import java.util.Scanner;

/*
 * [문제] 배열에 5개의 정수를 키보드를 이용하여 저장 후에
 * 		배열에 저장된 정수를 화면에 출력해 보세요.
 * 		(단, 일반 for문과 단축for문을 이용하여 출력해 볼 것.)
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >>> ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		//일반 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 정수: " + arr[i]);
		}

		System.out.println();
		//단축 for문
		for (int su : arr) {
			System.out.println("입력한 정수 >>> " + su);
		}

		sc.close();
	}
}
