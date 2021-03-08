package classes;

import java.util.Scanner;

/*
 * Member 객체의 각각의 멤버변수에
 * 키보드로 입력받은 데이터를 초기값으로 할당해 보자.
 */

public class Ex07_Member {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원의 이름, 나이, 연락처, 직업을 입력하세요.....");
		
		Member member1 = new Member(sc.next(), sc.nextInt(), sc.next(), sc.next());

		member1.getMemberInfo();
		
		sc.close();
	}
}
