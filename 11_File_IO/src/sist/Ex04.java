package sist;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 *   - 바이트 스트림 방식으로 데이터를 입출력하는 클래스.
 *     ==> xxxInputStream / xxxOutputStream
 * 2. 문자 스트림 관련 클래스
 *   - 문자 스트림 방식으로 데이터를 입출력하는 클래스.
 *     ==> xxxReader / xxxWriter
 * 3. 바이트 스트림 -> 문자 스트림으로 변환 클래스
 *   ==> InputStreamReader / OuputStreamWriter
 */

/*
 * 보조스트림 관련 클래스
 * - 스트림의 기능(속도)을 향상시키는 클래스.
 * - Bufferedxxx : 버퍼를 제공하는 보조스트림.
 * - 버퍼(buffer) : CPU와 I/O간의 속도 차이를 보완.
 */
public class Ex04 {
	public static void main(String[] args) {

		System.out.println("입력 후 끝 이라고 입력하세요....");

		InputStreamReader isr = new InputStreamReader(System.in);

		int readByte;

		try {
			while (true) {
				readByte = isr.read(); // 문자 스트림 -> 2바이트씩 읽는다.
				if (readByte == '끝') {
					break;
				}
				System.out.println((char) readByte);
			}
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
