package Exam01;

import javax.swing.JOptionPane;

public class ProductSearch {
	public static void main(String[] args) {

		String target = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		ProductSearchData psd = new ProductSearchData();
		String prodInfo = psd.search(target);

		try {
			prodInfo.length(); // 예외가 발생할 가능성이 있는 코드
			JOptionPane.showMessageDialog(null, psd.search(target));
		} catch (Exception e) {
			System.out.println("해당 상품은 없는 상품입니다.");
			JOptionPane.showMessageDialog(null, "해당 상품은 없는 상품입니다.");
		}

	}
}
