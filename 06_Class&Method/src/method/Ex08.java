package method;

import java.util.Scanner;

// 성적 처리

public class Ex08 {

	public static int total(int su1, int su2, int su3) {
		return su1 + su2 + su3;
	}

	public static double avg(int total) {
		return total / 3.0;
	}

	public static String grade(double avg) {
		String grade = "";

		if (avg >= 90) {
			grade = "A학점";
		} else if (avg >= 80) {
			grade = "B학점";
		} else if (avg >= 70) {
			grade = "C학점";
		} else if (avg >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}

		return grade;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 키보드로 이름과 국어점수, 영어점수, 수학점수를 입력을 받는다.
		System.out.print("이름을 입력하세요. >>>");
		String name = sc.next();

		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 입력: ");
		int math = sc.nextInt();

		// 2. 총점을 구하자 => 총점 메서드를 호출.
		int totalScore = total(kor, eng, math);

		// 3. 평균을 구하자 => 평균 메서드를 호출.
		double avgScore = avg(totalScore);

		// 4. 학점을 구하자 => 학점 메서드를 호출.
		String gradeScore = grade(avgScore);

		System.out.println();

		// 5. 화면에 성적을 출력한다.
		System.out.println("이름 >>> " + name);
		System.out.println("국어점수 >>> " + kor + "점");
		System.out.println("영어점수 >>> " + eng + "점");
		System.out.println("수학점수 >>> " + math + "점");
		System.out.println("총점 >>> " + totalScore + "점");
		System.out.printf("평균 >>> %.2f점\n", avgScore);
		System.out.println("학점 >>> " + gradeScore);

		sc.close();
	}
}
