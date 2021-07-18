package com.encore.service;
/*
 * 상품 구입 고객,
 * 상점에 입점된 상품 정보를 다루는 기능을 
 * 모아놓은 서비스 클래스...
 */

import com.encore.vo.Customer;
import com.encore.vo.Product;

public class OutletStoreService {
	//1. 특정 고객이 구입한 상품 정보를 리턴하는 기능
	public Product[ ] getProduct(Customer vo) {
		return vo.getProducts();
	}
	//2. 특정 고객이 구입한 상품의 maker들만 리턴하는 기능
	public String[ ] getAllProductMaker(Customer vo) {
		String[ ] temp = new String[vo.getProducts().length];
		Product[ ] pros = vo.getProducts();
		int cnt =0; //cnt=count
		for(Product p: pros) temp[cnt++]=p.getMaker();
		return temp;
	}
	//3. Outlet에 있는 모든 고객을 리턴하는 기능
	public Customer[ ] getAllCustomer(Customer[ ] custs) {
		Customer[] temp = new Customer[custs.length];
		int cnt =0;
		for(Customer c : custs) temp[cnt++] = c;
		return temp;
	}
	
	//4. 모든 고객 중 특정 고객을 검색(찾아내는)하는 기능
	public Customer getACustomer(Customer[ ] custs, int ssn) {
		Customer customer = null;
		for(Customer c : custs) {
			if(c.getSsn() == ssn) customer =c;
		}
		return customer;
	}
	//5. 특정 고객이 구입한 물건 중 최고가에 해당하는 물건의 가격을 리턴하는 기능
	public int maxPriceProduct(Customer c) {
		int maxPrice=0;
		Product[ ] pros = c.getProducts();
		for(Product p : pros) {
			if (p.getPrice() > maxPrice) maxPrice = p.getPrice();
		}
		return maxPrice;
	}
	//6. 모든 고객이 구입한 물건 중 특정 가격 이상되는 제품을 리턴하는 기능
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
	//7. 동일한 동네에 살고있는 고객들만 리턴하는 기능
	
		public Customer[ ] getSameAddressCustomer(Customer[ ] custs, String address) {
			int cnt =0;
			Customer[ ] temp = new Customer[custs.length];
			for(Customer c: custs) {
				if(c.getAddress().equals(address)) temp[cnt++] = c;
			}
			return temp;
	}
	
}

