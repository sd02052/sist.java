package method;

// 메서드 호출 시 반환형

public class Ex07 {

	// 반환되는 값이 숫자가 반환되는 경우
	public static int method1() {
		return 155;
	}

	// 반환되는 값이 변수가 반환되는 경우
	public static int method2(int su1, int su2) {
		int sum = (su1 * 2) + (su2 * 2);
		return sum;
	}

	// 반환되는 값이 수식이 반환되는 경우
	public static int method3(int su1, int su2) {
		return su1 + su2;
	}

	// 반환되는 값이 문자열이 반환되는 경우
	public static String method4() {
		return "hi!!!!!!";
	}

	// 반환되는 값이 문자열 변수가 변환이 되는 경우
	public static String method5(String a, String b) {
		String result = a + b;
		return result;
	}

	// 반환되는 값이 문자열 결합(+) 수식이 반환이 되는 경우
	public static String method6(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		// int num = method1();
		System.out.println("method1() 메서드 호출 후 반환된 값 >>> " + method1());

		System.out.println("method2() 메서드 호출 후 반환된 값 >>> " + method2(145, 200));

		System.out.println("method3() 메서드 호출 후 반환된 값 >>> " + method3(132, 55));

		System.out.println("method4() 메서드 호출 후 반환된 값 >>> " + method4());

		System.out.println("method5() 메서드 호출 후 반환된 값 >>> " + method5("대한", "민국"));

		System.out.println("method6() 메서드 호출 후 반환된 값 >>> " + method6("유", "관순"));

		System.out.println("프로그램 종료");
	}
}
