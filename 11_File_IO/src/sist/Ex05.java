package sist;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex05 {
	public static void main(String[] args) {

		InputStream is = null;

		int readByte;

		try {
			is = new FileInputStream("C:/test/sample.txt");
			while (true) {
				readByte = is.read();

				// 파일을 읽을 때 더이상 데이터가 없는 경우 -1이라는 값을 반환
				if (readByte == -1) {
					break;
				}

				System.out.print((char) readByte);
			}
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
