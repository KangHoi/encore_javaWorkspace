package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Account;
import com.encore.banking.Customer;

public class BankingTest {

	public static void main(String[] args) {
		
		//1. Customer 객체 생성... 이때 고객 정보를 Scanner객체를 통해 입력... 이름, ssn만
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 ssn을 입력해주십시오");
		
		String name = sc.nextLine();
		int ssn = sc.nextInt();
		
		Customer customer = new Customer(name, ssn);
		
		//2. 고객이 통장을 개설... 이때 Has a Relation(해징 관계) 연결
		customer.setAccount(new Account(10000.0));
		
		//3. 고객이 개설한 통장 반환...
		Account myAccount = customer.getAccount();
		
		//4. 통장 사용... 1만원 입금, 5천원 입금, 2천원 입금, 7천원 출금
		myAccount.deposit(10000.0);
		myAccount.deposit(300);
		myAccount.withdraw(10000);
		myAccount.withdraw(20000.0);
		
		//5. 최종적인 잔액을 콘솔로 출력... 1만원 + balance
		System.out.println("잔액은 " + myAccount.getBalance() + " 원입니다!!");
		
		

	}

}
