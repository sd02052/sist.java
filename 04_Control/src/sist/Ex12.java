package sist;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력받은 숫자가
 * 		홀수인지 짝수인지 판별해 보세요.
 */
public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력하세요. : ");

		int num = sc.nextInt();

		if (num % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

		sc.close();

//		int su1 = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요."));
//
//		if (su1 % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
	}
}
