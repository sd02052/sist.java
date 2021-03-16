package string;

public class Ex02 {
	public static void main(String[] args) {

		String str1 = "abc";

		String str2 = "def";

		System.out.println("str1 주소 >>> " + System.identityHashCode(str1));

		System.out.println("str2 주소 >>> " + System.identityHashCode(str2));

		System.out.println();

		str1 += str2;

		System.out.println("str1 주소 >>> " + System.identityHashCode(str1)); // 새로운 메모리 공간 확보.
		
		
	}
}
