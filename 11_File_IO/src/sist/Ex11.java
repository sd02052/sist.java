package sist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {

		// C:/sample/test.txt 파일에 내용을 저장해 보자.

		try {
			FileWriter fw = new FileWriter("C:/sample/test.txt");

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("==========================================");
			bw.newLine(); // 다음 줄로 이동

			bw.write("쌍용강북교육센터");
			bw.newLine();

			bw.write("자바기반 융합형 SW 개발자 양성과정 B 강의실");
			bw.newLine();

			bw.write("여러분!! 모두 취업합시다~~~ 화이팅!!");
			bw.newLine();
			
			// 버퍼 비우기
			bw.flush();
			
			// 입출력 객체 닫기
			bw.close();
			fw.close();
			System.out.println("파일 저장 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
