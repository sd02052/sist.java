package Exam01;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {
	Map<String, String> proTable;

	public ProductSearchData() {
		proTable = new HashMap<String, String>();

		proTable.put("세탁기", "드럼 세탁기 최신형");
		proTable.put("냉장고", "지펠 냉장고 최신형");
		proTable.put("Tv", "HDTV 150인치 최신 모델");
	}

	String search(String productName) {
//		return proTable.get(productName);

		String proInfo = null;

		if (proTable.equals(productName)) {
			proInfo = proTable.get(productName);
		}
		return proInfo;
	}
}
