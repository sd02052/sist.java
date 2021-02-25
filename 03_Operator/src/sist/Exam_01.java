package sist;

// 국어, 영어, 수학, 자바 점수를 키보드로 입력을 받아서
// 성적을 처리해 보자.
// 총점, 평균을 구해보자.

public class Exam_01 {
	public static void main(String[] args) {

		// 1.키보드로 국어, 영어, 수학, 자바 점수를 입력을 받자.
		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int math = Integer.parseInt(args[3]);
		int java = Integer.parseInt(args[4]);

		// 2. 국어 + 영어 + 수학 + 자바 점수 ==> 총점
		int total = kor + eng + math + java;

		// 3. 총점 / 과목수 ==> 평균
		double avg = total / 4.0;

		// 4. 화면에 성적을 출력.
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor + "점");
		System.out.println("영어점수: " + eng + "점");
		System.out.println("수학점수: " + math + "점");
		System.out.println("자바점수: " + java + "점");
		System.out.println("총점수: " + total + "점");
		System.out.printf("평균점수: %.2f점\n", avg);

	}
}
