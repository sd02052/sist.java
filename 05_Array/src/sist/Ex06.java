package sist;

import java.util.Scanner;

// 키보드로 배열의 크기를 입력을 받아 보자.

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기 입력 >>> ");
//		int size = sc.nextInt();

		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 >>> ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		sc.close();
	}
}
