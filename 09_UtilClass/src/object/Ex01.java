package object;

/*
 * Object 클래스
 * 1. java의 모든 클래스의 조상 클래스이다.
 *    ==> java의 가장 최상위 조상 클래스가 object 클래스이다.
 * 2. 사용자가 정의한 클래스에 자동으로 상속이 된다.
 *    ==> 단, extends 키워드를 사용하지 않은 클래스에만 상속이 됨.(다중상속이 안되기 때문에)
 *    
 * [Object 클래스의 주요한 메서드]
 * - toString() : - 객체 자신의 정보를 문자열로 반환
 *                - 인스턴스에 대한 정보를 문자열로 제공할 목적으로 사용됨.
 * - getClass() : - 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환함.
 * - hashCode() : - 객체 자신의 해쉬코드를 반환함.
 * - equals() : - 객체 자신과 또 다른 객체가 같은 객체인지 알려주는 메서드(boolean)
 * - clone() : - 객체 자신의 복사본을 반환함.
 */

public class Ex01 { // extends Object
	public static void main(String[] args) {

		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();

		System.out.println("toString() 메서드 >>> " + ex01.toString());
		System.out.println("getClass() 메서드 >>> " + ex01.getClass());
		System.out.println("hashCode() 메서드 >>> " + ex01.hashCode());
		
		if(ex01 == ex02) { // 다르다. 
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
}
