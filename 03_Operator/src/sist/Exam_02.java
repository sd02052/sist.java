package sist;

/*
 * 임의의 숫자 하나를 키보드로 입력을 받아
 * 그 숫자의 제곱근과 세제곱근을 구해보자.
 */
public class Exam_02 {
	public static void main(String[] args) {

		// 1. 임의의 숫자 하나를 키보드로부터 입력을 받자.
		int su = Integer.parseInt(args[0]);
		System.out.println("입력받은 정수 >>> " + su);

		// 2. 임의의 숫자의 제곱근을 구해야 한다.
		// 공식) 임의의 숫자 * 임의의 숫자
		System.out.println(su + "의 제곱근 >>> " + (su * su));

		// 3. 임의의 숫자의 세제곱근을 구해야 한다.
		// 공식) 임의의 숫자 * 임의의 숫자 * 임의의 숫자
		System.out.println(su + "의 세제곱근 >>> " + (su * su * su));
	}
}
