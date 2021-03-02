package sist;

/*
 * [문제5] 1-2+3-4+5-6+7-..... -100
 * 		결과값을 화면에 보여주세요.
 */
public class Exam_05 {
	public static void main(String[] args) {
		int hap = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				hap += i;
			} else {
				hap -= i;
			}
		}

		System.out.println("hap ==> " + hap);
	}
}
