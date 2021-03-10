package Exam;

public class Employee {
	String name;

	public Employee() {
	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 상속을 받을 클래스에서 재정의를 진행할 메서드
	int getPays() {
		return 0;
	}

}
