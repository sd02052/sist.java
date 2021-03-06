package interfaces;

import java.util.Scanner;

public class Ex02_Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		GoodCalc calc = new GoodCalc();

		System.out.print("첫번째 숫자 입력: ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 입력: ");
		int num2 = sc.nextInt();

		System.out.print("연산자 입력: ");
		String op = sc.next();

		switch (op) {
		case "+":
			System.out.println(calc.add(num1, num2));
			break;
		case "-":
			System.out.println(calc.sub(num1, num2));
			break;
		case "*":
			System.out.println(calc.mul(num1, num2));
			break;
		case "/":
			System.out.println(calc.div(num1, num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();
	}
}
