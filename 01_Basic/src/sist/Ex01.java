package sist;

// java에서 한 줄 주석

/*
 * java에서 두 줄 이상 주석문
 * 내용: java 기초
 * 작성자: 이성욱
 * 작성일자: 2021.02.23
 */

/*
 * java 프로그램 작성 방법
 * 1. 클래스 단위로 프로그램을 작성한다.
 * 		=> 클래스 이름 작성 시 첫 글자는 대문자로 작성한다. 
 * 2. 한 문장은 세미콜론(;)으로 끝난다.
 * 3. 클래스의 이름은 첫글자를 대문자로 시작하고,
 *    매서드의 이름은 첫글자를 소문자로 시작한다.
 *    =>메서드 이름에서 두 단어가 결합된 경우에는 두번째 글자의
 *    	첫번째 글자를 대문자로 작성한다.(camelcase 방식: 낙타의 등) 예) countOfMoney
 * 4. main() 메서드: 프로그램의 시작 위치를 의미한다.
 * 					가장 먼저 실행되는 놈이다.
 * 					=> JVM이 main()메서드를 찾아서
 * 					   메서드 안의 내용을 순차적으로 실행을 함.
 */

public class Ex01 { // { : Ex01 클래스 시작

	// 프로그램의 시작 위치를 의미함.
	// 가장 먼저 실행 되는 놈이다.
	public static void main(String[] args) {
		System.out.println("안녕하세요? 자바에 오신걸 환영합니다.");
		System.out.println("방가방가~~~");
		System.out.print("반갑습니다.");
		System.out.print("저는 홍길동입니다.");
		System.out.println();
		System.out.println();
		System.out.println("점심 맛있게 먹었습니다.");
		
		/*
		 * - System.out : 표준출력장치(모니터, 콘솔) 
		 * 	=>System.in: 표준입력장치(키보드)
		 * - println() : 지정된 장치에 결과(" " 안의 내용)를 출력하는 메서드.
		 * 				ln: line(출력 후 줄바꿈을 하라는 명령어) 
		 * - print() : 내용을 출력 후 다음줄로 이동하지 않고 
		 * 			   다음 출력 내용을 옆(오른쪽)에 출력해주는 메서드.
		 * 
		 * - 이클립스 사용 시 단축 키
		 *  * crtl + s ==> 소스를 저장하는 단축 키
		 *  * crtl + F11 ==> 실행 단축 키
		 *  * syso + crtl + space ==> System.out.println(); 자동완성
		 *  
		 */

	} // main() 메서드 끝

} // } : Ex01 클래스 끝
