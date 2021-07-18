package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		//1. Product Type 배열을 3개 생성
		//2. product를 3개 생성
		//1,2를 한 번에 실행되도록
		Product[ ] pros = {
				new Product("댕기머리샴푸", 23000, 2, "LG"),
				new Product("삼다수생수", 2000, 7,"HP"),
				new Product("컵라면",1200 , 10,"SAMSUNG"),
				new Product("캣타워", 340000, 1, "LG")
		};
		
		//3. for문을 이용해 product 정보 출력
		for(Product p: pros) {
			System.out.println(p.getDetail());
		}

	}

}
