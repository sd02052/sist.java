package method;

import java.util.Scanner;

public class Exam_02 {

	public static void input(String[] n, int[] id, String[] d, String[] p, Scanner sc) {
		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번째 학생 정보 입력");

			System.out.print("학생 이름 입력: ");
			n[i] = sc.next();
			System.out.print("학생 학번 입력: ");
			id[i] = sc.nextInt();
			System.out.print("학생 학과 입력: ");
			d[i] = sc.next();
			System.out.print("학생 전화번호 입력: ");
			p[i] = sc.next();
		}
	}

	public static void output(String[] n, int[] id, String[] d, String[] p) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 학생 정보 출력 ***");
			System.out.println("이름: " + n[i]);
			System.out.println("학번: " + id[i]);
			System.out.println("학과: " + d[i]);
			System.out.println("전화번호: " + p[i]);
			System.out.println("=====================================================");
		}
	}

	public static void search(String[] n, int[] id, String[] d, String[] p, Scanner sc) {
		System.out.print("조회할 학번 입력 : ");
		int target = sc.nextInt();

		for (int i = 0; i < n.length; i++) {
			if (target == id[i]) {
				System.out.println("이름: " + n[i]);
				System.out.println("학번: " + id[i]);
				System.out.println("학과: " + d[i]);
				System.out.println("전화번호: " + p[i]);
			}
		}
	}

	public static void update(int[] id, String[] d, String[] p, Scanner sc) {
		System.out.print("수정할 학생의 학번 입력 : ");
		int target = sc.nextInt();

		for (int i = 0; i < id.length; i++) {
			if (target == id[i]) {
				System.out.print("수정할 학생 학과 : ");
				d[i] = sc.next();
				System.out.println("수정할 학생 전화번호 : ");
				p[i] = sc.next();
			}
		}
	}

	public static void main(String[] args) {

		// 1. 키보드로 학생 수를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");

		// 2. 학생 정보 배열에 입력받은 학생 수 만큼의 배열을 생성하자.
		String[] name = new String[sc.nextInt()];
		int[] id = new int[name.length];
		String[] dept = new String[name.length];
		String[] phone = new String[name.length];

		// 3. 무한 반복을 통하여 메뉴를 만들고 메서드를 호출하자.
		while (true) {
			System.out.println("*** 학생 관리 프로그램 ***");
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			System.out.print("학생 관리 메뉴 중 하나를 선택하세요. : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: // 학생 등록 ==> 학생 등록 메서드 호출.
				input(name, id, dept, phone, sc);
				break;
			case 2: // 전체 출력 ==> 전체 출력 메서드 호출.
				output(name, id, dept, phone);
				break;
			case 3: // 학생 조회 메뉴 ==> 학생 조회 메서드 호출
				search(name, id, dept, phone, sc);
				break;
			case 4: // 학생 정보 수정 메뉴 ==> 학생 정보 수정 메서드 호출
				update(id, dept, phone, sc);
				break;
			case 5: // 프로그램 종료 메뉴 ==> 프로그램 종료 메서드 호출
				//end();
				break;
			default:
				System.out.println("학생 관리 프로그램에 없는 메뉴입니다.");
				break;
			}
		}
	}
}
