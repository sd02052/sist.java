package Exam;

import java.util.Scanner;

public class Ex_Temporary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		
		Temporary tem = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
		
		System.out.println("=======================================");

		tem.cal();
		
		sc.close();
	}
}
