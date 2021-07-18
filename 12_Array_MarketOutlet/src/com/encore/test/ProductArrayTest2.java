package com.encore.test;

import com.encore.vo.Product;
//��ɵ��� �߰��غ��ڽ��ϴ�...

public class ProductArrayTest2 {

	public static void main(String[] args) {
	
		Product[ ] pros = {
				new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
				new Product("��ټ�����", 2000, 7,"HP"),
				new Product("�Ŷ��",1200 , 10,"SAMSUNG"),
				new Product("ĹŸ��", 340000, 1, "LG")
		};
		
		//1. ��ǰ���� ����Ŀ�� ����մϴ�...
		System.out.println("=======��ǰ���� ����Ŀ�� ���=======");
		for(Product p : pros) {
			System.out.println(p.getMaker());
			
		//2. Ư�� ���� �̻��� ��ǰ�� ���
		System.out.println("========10���� �̻��� ��ǰ ���=======");
		for(Product p1 : pros) {
			if(p1.getPrice()>=100000) {System.out.println(p1.getDetail());
		}

	}
		//3. ������ ���ǵ��� �� ����
		System.out.println("=======�� ���԰����� ���=======");
		int total =0;
		for(Product p1 : pros) total +=p1.getPrice() * p1.getQuantity();
		System.out.println("Total Price " + total + "��");}
		

}
	}
