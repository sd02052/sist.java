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

public class Exam_06_02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				String value = (arr[i][j] == 0) ? "" : "" + arr[i][j];
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
