package generic;

class Student {

	String name;

	public Student() {
	} // 기본생성자

	public Student(String name) {
		this.name = name;
	} // 인자생성자

}

// 제네릭이 2개인 경우에는 기재하는 자료형은 
// 반드시 참조자료형만 올 수 있음.
class Person<T, E> {

	T data;
	E id;

	public Person() {
	} // 기본생성자

	public Person(T data, E id) {
		this.data = data;
		this.id = id;
	}
}

public class Ex04 {
	public static void main(String[] args) {

		Person<Student, Integer> person = new Person<Student, Integer>(new Student("홍길동"), new Integer(2021031601));

		System.out.println(person.data.name + " : " + person.id);
	}
}
