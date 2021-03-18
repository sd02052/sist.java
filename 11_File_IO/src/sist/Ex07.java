package sist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {
	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("한 줄 문자열을 입력하세요....");

		try {
			// readLine() : 보조스트림에서 한 줄을 입력받는 메서드.
			String str = br.readLine();

			System.out.println("입력 받은 문자열 >>> " + str);
			
			// 입출력 객체는 닫아 주어야 한다.
			// 닫을때는 거꾸로 닫아준다.
			br.close();
			isr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
