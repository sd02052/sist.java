package method;

import java.util.Scanner;

// 계산기 예제

public class Ex04 {

	public static void plus(int su1, int su2) {
		int num = su1 + su2;
		System.out.println(su1 + " + " + su2 + " = " + num);
	}

	public static void minus(int su1, int su2) {
		int num = su1 - su2;
		System.out.println(su1 + " - " + su2 + " = " + num);
	}

	public static void mul(int su1, int su2) {
		int num = su1 * su2;
		System.out.println(su1 + " * " + su2 + " = " + num);
	}

	public static void div(int su1, int su2) {
		int num = su1 / su2;
		System.out.println(su1 + " / " + su2 + " = " + num);
	}

	public static void mod(int su1, int su2) {
		int num = su1 % su2;
		System.out.println(su1 + " % " + su2 + " = " + num);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 키보드로부터 두 개의 정수와 연산자를 입력을 받자.
		System.out.print("첫번째 정수 입력: ");
		int su1 = sc.nextInt();

		System.out.print("두번째 정수 입력: ");
		int su2 = sc.nextInt();

		System.out.print("연사자 입력: ");
		String op = sc.next();

		// 2. 연산자 변수에 입력된 연산기호를 가지고 해당 기호에 맞는
		// 메서드를 호출해 주자.
		switch (op) {
		case "+":
			plus(su1, su2);
			break;
		case "-":
			minus(su1, su2);
			break;
		case "*":
			mul(su1, su2);
			break;
		case "/":
			div(su1, su2);
			break;
		case "%":
			mod(su1, su2);
			break;
		}

		sc.close();
	}
}
