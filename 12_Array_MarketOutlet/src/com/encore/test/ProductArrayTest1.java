package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		//1. Product Type �迭�� 3�� ����
		//2. product�� 3�� ����
		//1,2�� �� ���� ����ǵ���
		Product[ ] pros = {
				new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
				new Product("��ټ�����", 2000, 7,"HP"),
				new Product("�Ŷ��",1200 , 10,"SAMSUNG"),
				new Product("ĹŸ��", 340000, 1, "LG")
		};
		
		//3. for���� �̿��� product ���� ���
		for(Product p: pros) {
			System.out.println(p.getDetail());
		}

	}

}