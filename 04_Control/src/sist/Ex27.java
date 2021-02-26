package sist;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력을 받은 수까지의 홀수의 합과 짝수의 합을 구하여 
 * 		화면에 출력해 보세요.
 */
public class Ex27 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. >>> ");
		int max = sc.nextInt();
		int su = 1;
		int odd = 0, even = 0;

		while (su <= max) {
			if (su % 2 == 1) {
				odd += su++;
			} else {
				even += su++;
			}
		}

		System.out.println(max + " 까지의 홀수의 합 >>> " + odd);
		System.out.println(max + " 까지의 짝수의 합 >>> " + even);

		sc.close();

	}
}
