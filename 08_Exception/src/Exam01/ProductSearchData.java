package Exam01;

public class ProductSearchData {
	String[][] proTable = { { "세탁기", "드럼 세탁기 최신형" }, { "냉장고", "지펠 냉장고 최신형" }, { "TV", "HDTV 150인치 최신 모델" } };

	public ProductSearchData() {
	}

	public String search(String productName) {
		String proInfo = "";
		for (int i = 0; i < proTable.length; i++) {
			if (productName.equals(proTable[i][0])) {
				proInfo = proTable[i][1];
			} else {
				proInfo = null;
			}
		}
		return proInfo;
	}
}
