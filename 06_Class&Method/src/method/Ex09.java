package method;

import java.util.Scanner;

public class Ex09 {
	// 2과목 총점을 구하는 메서드
	public static int sum2(int su1, int su2) {
		return su1 + su2;
	}

	// 3과목 총점을 구하는 메서드
	public static int sum3(int su1, int su2, int su3) {
		return su1 + su2 + su3;
	}

	// 4과목 총점을 구하는 메서드
	public static int sum4(int su1, int su2, int su3, int su4) {
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
		System.out.println("2과목 총점 >>> " + sum2(kor, eng));
		// 3과목 총점 메서드 호출
		System.out.println("3과목 총점 >>> " + sum3(kor, eng, math));
		// 4과목 총점 메서드 호출
		System.out.println("4과목 총점 >>> " + sum4(kor, eng, math, java));

		sc.close();
	}
}
