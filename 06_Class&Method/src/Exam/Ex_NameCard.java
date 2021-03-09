package Exam;

import java.util.Scanner;

public class Ex_NameCard {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");

		NameCard nc = new NameCard(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());

		System.out.println("================================================");

		nc.display();

		sc.close();
	}
}
