package Exam01;

import javax.swing.JOptionPane;

public class ProductSearch {
	public static void main(String[] args) {

		ProductSearchData psd = new ProductSearchData();
		String target = "";

		try {
			target = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
			JOptionPane.showMessageDialog(null, psd.search(target));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "해당 상품은 없는 상품입니다.");
		}

	}
}
