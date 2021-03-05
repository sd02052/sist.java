package method;

import java.util.Scanner;

/*
 * 메서드 다중정의(method overloading)
 * - 동일한 클래스에서 동일한이름이 메서드가 여러 개 정의되는 자바 문법.
 * - 일관된 이름을 정의할 수 있어서 개발자(사용자)에게 코드의 직관성을 제공함.
 * 
 * [메서드 다중정의 규칙]
 * 1. 메서드 이름이 동일해야 함.
 * 2. 반드시 매개변수는 자료형이 다르거나 순서가 다르거나 또는 매개변수의 갯수가 달라야 함.
 * 3. 리턴타입(반환형)은 무관함.
 */

public class Ex10 {
	// 2과목 총점을 구하는 메서드
	public static int sum(int su1, int su2) {
		return su1 + su2;
	}

	// 3과목 총점을 구하는 메서드
	public static int sum(int su1, int su2, int su3) {
		return su1 + su2 + su3;
	}

	// 4과목 총점을 구하는 메서드
	public static int sum(int su1, int su2, int su3, int su4) {
		return su1 + su2 + su3 + su4;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 입력: ");
		int math = sc.nextInt();

		System.out.print("자바 점수 입력: ");
		int java = sc.nextInt();

		System.out.println();

		// 2과목 총점 메서드 호출
		System.out.println("2과목 총점 >>> " + sum(kor, eng));
		// 3과목 총점 메서드 호출
		System.out.println("3과목 총점 >>> " + sum(kor, eng, math));
		// 4과목 총점 메서드 호출
		System.out.println("4과목 총점 >>> " + sum(kor, eng, math, java));

		sc.close();
	}
}
