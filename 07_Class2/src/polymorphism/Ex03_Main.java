package polymorphism;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class Ex03_Main {
	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

		// B b2 = e;
		// C c2 = d;
		
		if(d instanceof B) { // instanceof : 인스턴스가 같는지 물어보는 연산자.
			System.out.println("true");
		}
	}
}
