package sist;

/*
 * [문제6]
 * 
 * 		1
 * 		2	3
 * 		4	5	6
 * 		7	8	9	10
 * 		11	12	13	14	15
 */

public class Exam_06_01 {
	public static void main(String[] args) {

		int[][] arr = new int[5][];

		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
