package method;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력: ");
		Student[] a = new Student[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Student("", 0, "", "");
		}
		while (true) {
			System.out.println("===================================메뉴선택===================================");
			System.out.print("1.학생등록\t\t 2.전체출력\t 3.학생조회\t 4.정보수정\t 5.프로그램 종료\n");
			System.out.print("사용할 메뉴를 입력하세요 >>> ");

			switch (sc.nextInt()) {
			case 1:
				System.out.print("이름: ");
				a[count].setName(sc.next());
				System.out.print("학번: ");
				a[count].setId(sc.nextInt());
				System.out.print("학과: ");
				a[count].setDept(sc.next());
				System.out.print("전화번호: ");
				a[count].setPhone(sc.next());
				count++;
				System.out.println("등록완료!");
				break;
			case 2:
				for (int i = 0; i < a.length; i++) {
					if (a[i].name.equals("")) {
						continue;
					}
					a[i].show();
					System.out.println();
				}
				break;
			case 3:
				System.out.print("조회할 학번: ");
				int target1 = sc.nextInt();
				for (int i = 0; i < a.length; i++) {
					if (target1 == a[i].getId()) {
						a[i].show();
						System.out.println();
					}
				}
				break;
			case 4:
				System.out.print("수정할 학번: ");
				int target2 = sc.nextInt();
				for (int i = 0; i < a.length; i++) {
					if (target2 == a[i].getId()) {
						System.out.print("변경할 학과: ");
						a[i].setDept(sc.next());
						System.out.print("변경할 전화번호: ");
						a[i].setPhone(sc.next());
					}
				}
				System.out.println("수정완료!");
				break;
			case 5:
				System.out.print("종료하시겠습니까? (y/n) ");
				if (sc.next().equalsIgnoreCase("y")) {
					System.exit(0);
					sc.close();
				}
			}
		}
	}
}

class Student {
	String name;
	int id;
	String dept;
	String phone;
	int num;

	void add(Student[] a) {
		
	}

	Student(String name, int id, String dept, String phone) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.phone = phone;
	}

	void show() {
		System.out.println("학생 이름: " + getName());
		System.out.println("학생 번호: " + getId());
		System.out.println("학생 학과: " + getDept());
		System.out.println("학생 전화번호: " + getPhone());
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setId(int id) {
		this.id = id;
	}

	int getId() {
		return this.id;
	}

	void setDept(String dept) {
		this.dept = dept;
	}

	String getDept() {
		return this.dept;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getPhone() {
		return this.phone;
	}
}