package collection;

import java.util.Stack;

/*
 * Stack 클래스(자료 구조)
 * - 후입선출(LIFO : Last In First Out) 구조임.
 */

public class Ex06 {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// 1. push() : stack에 저장시키는 메서드
		stack.push("강감찬");
		stack.push("세종대왕");
		stack.push("김 구");
		stack.push("윤봉길");
		stack.push("광개토태왕");

		// 2. peek() : 저장된 데이터를 가져오는 메서드
		// peek() : - stack의 맨 위에 있는 데이터를 가져오는 메서드.
		// - 데이터를 stack에서 제거하지 않음.
		System.out.println("stack peek() >>> " + stack.peek());

		// 3. pop() : 저장된 데이터를 가져오는 메서드
		// pop() : - stack의 맨 위에 있는 데이터를 가져오는 메서드.
		// - 데이터를 stack에서 제거함.

		while (!stack.isEmpty()) { // stack이 비어있지 않으면 계속 실행.
			System.out.println("이름 >>> " + stack.pop());
		}
	}
}
