package sist;

import java.util.Scanner;

/*
 * 내가 가고 싶은 5개 나라를 
 * 키보드로 입력을 받아서 배열에 저장을 해 보자.
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1단계: 5개 나라가 저장될 배열 선언.
		String[] nation = new String[5];

		for (int i = 0; i < nation.length; i++) {
			System.out.print((i + 1) + "번째나라 입력 >>> ");
			nation[i] = sc.next();
		}

		// 배열에 저장된 5개 나라를 출력해 보자.
		for (int j = 0; j < nation.length; j++) {
			System.out.print(nation[j] + "\t");
		}

		// for문을 단축시킨 반복문 => 단축 for문(개선된 for문)
		/*
		 * 단축 for문(개선된 for문) - java jdk 1.5버전부터 추가된 기능. - 주로 배열의 요소(원소, 값)를 처리(출력)할 때
		 * 사용.
		 * 
		 * 형식) for(자료형 변수명 : 배열명){ 반복 실행문; }
		 * 
		 * 실행) - 배열의 첫번째 인덱스[0]에 있는 데이터를 좌변의 변수에 할당하여 출력을 함. 데이터의 수만큼 자동 반복하여 출력함.
		 * 
		 * 주의) - 우변에 있는 배열명의 자료형과 좌변의 변수명의 자료형은 반드시 일치해야 함. - 만약 일치하지 않으면 error 발생.
		 */
		System.out.println();
		for (String a : nation) {
			System.out.println("내가 가고 싶은 5개국 >>> " + a);
		}
		sc.close();
	}
}
