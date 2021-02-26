package sist;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.nextLine();

		System.out.print("국어점수를 입력하세요 >>> ");
		int kor = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수를 입력하세요 >>> ");
		int eng = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수를 입력하세요 >>> ");
		int math = Integer.parseInt(sc.nextLine());

		System.out.print("자바점수를 입력하세요 >>> ");
		int java = Integer.parseInt(sc.nextLine());

		// 2. 총점을 구하자.
		int total = kor + eng + math + java;

		// 3. 평균을 구하자.
		double avg = total / 4.0;

		// 4. 학점을 구하자.
		String grade;
		/*if (avg >= 90) {
			if (avg >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		*/
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
		}

		// 5. 성적결과를 화면에 출력해 보자.
		System.out.println("이름 >>> " + name);
		System.out.println("국어점수 >>> " + kor);
		System.out.println("영어점수 >>> " + eng);
		System.out.println("수학점수 >>> " + math);
		System.out.println("자바점수 >>> " + java);
		System.out.println("총점 >>> " + total);
		System.out.printf("평균 >>> %.2f\n", avg);
		System.out.println("학점 >>> " + grade);

		sc.close();
	}
}
