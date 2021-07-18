package com.encore.service;
/*
 * ��ǰ ���� ����,
 * ������ ������ ��ǰ ������ �ٷ�� ����� 
 * ��Ƴ��� ���� Ŭ����...
 */

import com.encore.vo.Customer;
import com.encore.vo.Product;

public class OutletStoreService {
	//1. Ư�� ������ ������ ��ǰ ������ �����ϴ� ���
	public Product[ ] getProduct(Customer vo) {
		return vo.getProducts();
	}
	//2. Ư�� ������ ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String[ ] getAllProductMaker(Customer vo) {
		String[ ] temp = new String[vo.getProducts().length];
		Product[ ] pros = vo.getProducts();
		int cnt =0; //cnt=count
		for(Product p: pros) temp[cnt++]=p.getMaker();
		return temp;
	}
	//3. Outlet�� �ִ� ��� ������ �����ϴ� ���
	public Customer[ ] getAllCustomer(Customer[ ] custs) {
		Customer[] temp = new Customer[custs.length];
		int cnt =0;
		for(Customer c : custs) temp[cnt++] = c;
		return temp;
	}
	
	//4. ��� ���� �� Ư�� ������ �˻�(ã�Ƴ���)�ϴ� ���
	public Customer getACustomer(Customer[ ] custs, int ssn) {
		Customer customer = null;
		for(Customer c : custs) {
			if(c.getSsn() == ssn) customer =c;
		}
		return customer;
	}
	//5. Ư�� ������ ������ ���� �� �ְ����� �ش��ϴ� ������ ������ �����ϴ� ���
	public int maxPriceProduct(Customer c) {
		int maxPrice=0;
		Product[ ] pros = c.getProducts();
		for(Product p : pros) {
			if (p.getPrice() > maxPrice) maxPrice = p.getPrice();
		}
		return maxPrice;
	}
	//6. ��� ������ ������ ���� �� Ư�� ���� �̻�Ǵ� ��ǰ�� �����ϴ� ���
	public Product[ ] getMorePriceProducts(Customer[ ] custs, int price ) {
		int len = 0;
		int cnt = 0;
		for (Customer c : custs) len += c.getProducts().length;
		Product[ ] temp = new Product[len];
		for(Customer c : custs) {
			for(Product p : c.getProducts()) {
				if(p.getPrice() > price) temp[cnt++] = p;			
			}
		}
		return temp;

	}
	//7. ������ ���׿� ����ִ� �����鸸 �����ϴ� ���
	
		public Customer[ ] getSameAddressCustomer(Customer[ ] custs, String address) {
			int cnt =0;
			Customer[ ] temp = new Customer[custs.length];
			for(Customer c: custs) {
				if(c.getAddress().equals(address)) temp[cnt++] = c;
			}
			return temp;
	}
	
}
