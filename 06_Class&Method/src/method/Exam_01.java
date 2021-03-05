package method;

import java.util.Scanner;

public class Exam_01 {
	static Scanner sc = new Scanner(System.in);
	static int count = 0;

	public static void add(String[] str1, int[] str2, String[] str3, String[] str4) {

		System.out.print("이름: ");
		str1[count] = sc.next();
		System.out.print("학번: ");
		str2[count] = sc.nextInt();
		System.out.print("학과: ");
		str3[count] = sc.next();
		System.out.print("전화번호: ");
		str4[count] = sc.next();
		count++;
		System.out.println("등록완료!");
	}

	public static void showTotal(String[] str1, int[] str2, String[] str3, String[] str4) {
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == null) {
				continue;
			}
			System.out.printf("이름: %s\t 학번: %d\t 학과: %s\t 전화번호: %s\t\n", str1[i], str2[i], str3[i], str4[i]);
		}
	}

	public static void search(String[] str1, int[] str2, String[] str3, String[] str4) {
		int target = 0;
		System.out.print("조회할 학번 입력: ");
		int id1 = sc.nextInt();

		for (int i = 0; i < str2.length; i++) {
			if (id1 == str2[i]) {
				System.out.println("이름: " + str1[target]);
				System.out.println("학번: " + str2[target]);
				System.out.println("학과: " + str3[target]);
				System.out.println("전화번호: " + str4[target]);
			}
		}
	}

	public static void change(int[] str1, String[] str2, String[] str3) {
		System.out.println("수정할 학번 입력: ");
		int id1 = sc.nextInt();
		int target = 0;
		for (int i = 0; i < str1.length; i++) {
			if (id1 == str1[i]) {
				target = i;
			}
		}
		System.out.print("변경할 학과: ");
		str2[target] = sc.next();
		System.out.print("변경할 전화번호: ");
		str3[target] = sc.next();
		System.out.println("변경완료!");
	}

	public static void exitProgram() {
		System.out.print("프로그램을 종료하시겠습니까?(y/n) ");
		String check = sc.next();
		if (check.equals("y")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		System.out.println("===================================프로그램 시작===================================");
		System.out.print("학생 수를 입력하세요. : ");
		int num = sc.nextInt();

		String[] name = new String[num];
		int[] id = new int[num];
		String[] dept = new String[num];
		String[] phone = new String[num];

		while (true) {
			System.out.println("===================================메뉴선택===================================");
			System.out.print("1.학생등록\t\t 2.전체출력\t 3.학생조회\t 4.정보수정\t 5.프로그램 종료\n");
			System.out.print("사용할 메뉴를 입력하세요 >>> ");

			switch (sc.nextInt()) {
			case 1:
				add(name, id, dept, phone);
				break;
			case 2:
				showTotal(name, id, dept, phone);
				break;
			case 3:
				search(name, id, dept, phone);
				break;
			case 4:
				change(id, dept, phone);
				break;
			case 5:
				exitProgram();
				break;
			}
		}
	}
}
