package Exam;

public class Person {
	String name;
	String gender;
	int age;

	public Person() {
	} // 기본생성자

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	} // 인자생성자

	void display() {
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age + "세");
	}
}
