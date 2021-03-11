package Exam2;

import java.util.Scanner;

public class Ex_Pay {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("고용형태-정규직<P>, 임시직<T>를 입력하세요.");
		String part = sc.next();

		if (part.equalsIgnoreCase("p")) {
			part = "정규직";
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			Permanent permanent = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());

			System.out.println("========================================");
			System.out.println("고용형태: " + part);
			System.out.println("이름: " + permanent.getName());
			System.out.printf("급여: %,d원\n", permanent.getPays());
		} else if (part.equalsIgnoreCase("t")) {
			part = "임시직";
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			Temporary temporary = new Temporary();
			temporary.setName(sc.next());
			temporary.setTime(sc.nextInt());
			temporary.setPay(sc.nextInt());

			System.out.println("========================================");
			System.out.println("고용형태: " + part);
			System.out.println("이름: " + temporary.getName());
			System.out.printf("급여: %,d원\n", temporary.getPays());
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();
	}
}
