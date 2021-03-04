package sist;

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];

		System.out.println("5개의 숫자를 입력하세요.");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}

		System.out.println("===내림차순으로 정렬===");

		int temp = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[j] > score[i]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}

		sc.close();
	}
}
