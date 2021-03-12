package polymorphism;

public class Ex01_Animal {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();

		dog.sound();
		cat.sound();
		tiger.sound();
		System.out.println();

		// 다형성을 이용하여 객체를 생성
		Animal animal1 = new Dog(); // 조상객체를 이용해서 자손객체를 생성 => 다형성
		animal1.sound();
		// 다형성을 이용하여 부모의 참조변수로 자식의 객체를 생성했을 때
		// 부모에는 없는 자식의 멤버는 호출할 수 없다.
		// animal1.output();

		Animal animal2 = new Cat();
		animal2.sound();

		Animal animal3 = new Tiger();
		animal3.sound();
		
		// Dog animal10 = new Animal();
	}
}
