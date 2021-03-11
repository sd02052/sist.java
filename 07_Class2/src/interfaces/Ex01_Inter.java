package interfaces;

public class Ex01_Inter {
	public static void main(String[] args) {

		Sub sub = new Sub();

		// static final 상수로 인식
		// 상수에 값을 변경하는 것은 불가능.
		// sub.num=250;

		sub.output1();
		sub.output2();

	}
}
