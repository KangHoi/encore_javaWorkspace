package com.encore.service;

import com.encore.vo.Product;

/*
 * ProductStore�� �ִ� �پ��� ��ǰ���� �ٷ��
 * ��ɸ��� ��Ƴ��� Ŭ����...
 * �̷� ��ɸ����� �ۼ��� Ŭ������ ����(Ȥ�� Manage) Ŭ������ �Ѵ�
 * 
 * �� Ŭ�������� �ٷ�� ��ɵ�...
 * 1) ��� ��ǰ���� maker�� ����ϴ� ���
 * 2) ��ǰ���� �� ���Ծ��� �����ϴ� ���
 * 3) Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
 * 4) Ư�� ȸ�� ��ǰ���� �����ϴ� ���
 * 5) ������ ��ǰ�� ��� ������ �����ϴ� ���
 * --> ����� Identifier ���� ����� �Բ�
 */

public class ProductStoreService {
	public void printAllProductMaker(Product[ ] pros) {
		for(Product p : pros) System.out.println(p.getMaker());
	}
	
	public int getTotalPrice(Product[ ] pros) {
		int total = 0;
		for(Product p : pros) total += p.getPrice() *p.getQuantity();
		return total;
	}
	
	public Product[ ] getMorePrice(Product[ ] pros, int price) {
		Product[ ] temp = new Product[pros.length];//�Ͻ������� �ִ��� length�� ����� ����. �̶� �⺻�� null�� ä����
		int idx =0;
		for(Product p : pros) {
			if(p.getPrice()>=price) {
				temp[idx++] = p;
				//idx++;
			}
	
		}//for
		return temp;
		
	}//
		public Product[ ] getCertainCompany(Product[ ] pros, String company) {
			Product[ ] temp = new Product[pros.length];//�Ͻ������� �ִ��� length�� ����� ����. �̶� �⺻�� null�� ä����
			int idx =0;
			for(Product p : pros) {
				if(p.getCompany().equals(company)) {
					temp[idx++] = p;
					}
			}//for
			return temp;

		}
		
		public int getAvgPrice(Product[ ] pros) {
			//������ ������ �� ������ ���ϴ� �޼ҵ� ȣ��.. ����
			//�� ������ ������ ������.
			return getTotalPrice(pros)/pros.length;
		}
		
}


