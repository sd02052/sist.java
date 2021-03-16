package generic;

class Generic<T> { // 두개 클래스 만들지 않고 하나의 클래스로 통합해서 사용할 수 있다.

	T[] str;
	T var;

	void setStr(T[] str) {
		this.str = str;
	}

	void setVar(T var) {
		this.var = var;
	}

	void output() {
		for (T k : str) {
			System.out.println("str 배열 요소 >>> " + k);
		}
		System.out.println("var >>> " + var);
	}
}

public class Ex03 {
	public static void main(String[] args) {

		// String 타입의 클래스 객체 생성
		Generic<String> st = new Generic<String>();

		String[] str = { "홍길동", "이순신", "유관순" };
		String var = "김연아";

		st.setStr(str);
		st.setVar(var);
		st.output();

		System.out.println();
		
		// Integer 타입의 클래스 객체 생성
		Generic<Integer> it = new Generic<Integer>();

		Integer[] iarr = { 100, 200, 300 };
		Integer ivar = 500;

		it.setStr(iarr);
		it.setVar(ivar);
		it.output();
	}
}
