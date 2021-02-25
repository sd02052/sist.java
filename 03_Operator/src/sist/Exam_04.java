package sist;

/*
 * 키보드로부터 임의의 숫자 4자리를 입력받아서
 * 각각의 화폐매수가 몇 장이 필요한지 코딩을 통해서
 * 화면에 출력해 보세요.
 */
public class Exam_04 {
	public static void main(String[] args) {

		// 1. 키보드로부터 임의의 숫자 4자리를 입력을 받자.
		int target = Integer.parseInt(args[0]);

		// 2. 각각의 화폐단위 변수를 설정을 한다.
		int count_5000, count_1000, count_500, count_100, count_50, count_10, count_5, count_1, res;
		
		// 3. 화폐 매수를 계산을 하자.
		count_5000 = target / 5000; //오천원의 몫 ==> 1
		res = target % 5000;		//나머지 ==> 3792
		
		count_1000 = res / 1000;	//천원의 몫 ==> 3
		res %= 1000;				//나머지 ==> 792
		
		count_500 = res / 500;		//오백원의 몫 ==> 1
		res %= 500;					//나머지 ==> 292
		
		count_100 = res / 100;		//백원의 몫 ==> 2
		res %= 100;					//나머지 ==> 92

		count_50 = res / 50;		//오십원의 몫 ==> 1
		res %= 50;					//나머지 ==> 42
		
		count_10 = res / 10;		//십원의 몫 ==> 4
		res %= 10;					//나머지 ==> 2
		
		count_5 = res / 5;			//오원의 몫 ==> 0
		res %= 5;					//나머지 ==> 2
		
		count_1 = res / 1;			//일원의 몫 ==> 2
		res %= 1;					//나머지 ==> 0
		
		// 4. 화면에 출력해 보자
		System.out.println("입력받은 숫자: "+ target);
		System.out.println("오천원 지페: "+ count_5000 + "장");
		System.out.println("천원 지페: "+ count_1000 + "장");
		System.out.println("오백원 동전: "+ count_500 + "개");
		System.out.println("백원 동전: "+ count_100 + "개");
		System.out.println("오십원 동전: "+ count_50 + "개");
		System.out.println("십원 동전: "+ count_10 + "개");
		System.out.println("오원 동전: "+ count_5 + "개");
		System.out.println("일원 동전: "+ count_1 + "개");
	}
}
