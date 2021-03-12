package finals;

/*
 * final 지정자
 * - 클래스나 멤버변수, 멤버메서드에 적용해서 사용함.
 * - 클래스 : - 변경할 수 없는 클래스, 확장될 수 없는 클래스.
 *         - final로 지정된 클래스는 다른 클래스의 조상클래스가 될 수 없음.
 * - 멤버메서드 : - 변경될 수 없는 메서드.
 *            - final로 지정된 메서드는 오버라이딩을 통해 재정의를 할 수 없음.
 * - 멤버변수 : - 변수명 앞에 final이라는 키워드가 붙으면, 값을 변경할 수 없음.
 * 
 * - 대표적인 final 클래스는 String 클래스와 Math 클래스가 있음.
 */

class AA {

	final int su = 150; // 상수로 인식. - 값 변경이 안됨.

	final void output() {
		System.out.println("final output() 메서드 호출~~");
	}
}

class BB extends AA {
	
//	final로 지정된 메서드는 오버라이딩을 통해서 재정의를 할 수 없다.
//	@Override
//	void output() {
//		System.out.println("output() 메서드 재정의");
//	}
}

// final로 지정된 클래스는 다른 클래스의 조상(부모)클래스가 될 수 없다.
//class AB extends Ex01{
//	
//}


public final class Ex01 {
	public static void main(String[] args) {

		AA aa = new AA();

		// aa.su = 300;

	}
}
