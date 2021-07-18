package com.encore.banking;
import com.encore.banking.Account;
// 고객에 관한 정보를 가지고 있는 클래스
// 은행업무를 보는 고객...Account를 Hasing 해야한다

public class Customer {
	public String name;
	public int ssn;
	
	// Hasing 단계 - 1)필드 선언 2)주입
	//1)필드 선언
	public Account account;
	
	//생성자
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//2)주입
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//3)고객이 개설한 통장을 받아서 사용하는 기능..
	public Account getAccount() {
		return account;
	}
	
	public String getCustomerInfo() {
		return name + "," + ssn;
	}

	
}
