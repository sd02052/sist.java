package classes;

public class Ex13_Number {
	public static void main(String[] args) {

		Number number = new Number();
		
		//number.num1 = 500; // 외부에서 접근 방법
		//number.num2 = 300;

		number.setNum1(500);
		number.setNum2(300);
		
		System.out.println("num1 >>> "+ number.getNum1());
		System.out.println("num2 >>> "+ number.getNum2());
	}
}
