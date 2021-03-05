package method;

import java.util.Scanner;

/*
 * 개인별 성적 처리 - 무한반복
 */

public class Exam_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) { // 무한반복

			// 키보드로 이름, 국어, 영어, 수학점수를 입력을 받자.
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			System.out.print("수학점수: ");
			int math = sc.nextInt();

			System.out.println();

			int total = kor + eng + math;

			double avg = total / 3.0;

			String grade = "";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}

			System.out.println("이름: " + name);
			System.out.println("국어점수: " + kor);
			System.out.println("영어점수: " + eng);
			System.out.println("수학점수: " + math);
			System.out.println("총점: " + total);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("성적: " + grade);
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");

			System.out.println();

			System.out.print("계속할까요?(y: 계속/ n: 종료) ");
			String check = sc.next();

			// equalsIgnoreCase() : 대소문자 구분하지안하고 비교함.
			if (check.equalsIgnoreCase("n")) {
//				System.exit(0);
				break;
			}
		} // while 반복문의 end

		System.out.println("수고하셨습니다.");
		sc.close();
	}
}
