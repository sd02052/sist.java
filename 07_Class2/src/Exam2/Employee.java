package Exam2;

public abstract class Employee {
	String name;

	public Employee() {
	} // 인자생성자 만들기 위해서 기본생성자 만들어야 한다.

	public Employee(String name) {
		this.name = name;
	} // 인자생성자

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 급여를 계산하는 메서드
	abstract int getPays(); // 추상메서드
}
