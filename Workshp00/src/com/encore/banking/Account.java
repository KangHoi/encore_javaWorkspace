package com.encore.banking;
//통장에 관한 정보를 가지고 있는 클래스..
/*
 * 1. 필드 선언
 * 2. 값을 주입할 통로 고민: 1) setter 2) 생성자
 * 3. 필드 값 받아온다
 */
	public class Account {
		
		public double balance; //필드선언
	
		public Account(double balance) { //생성자 주입 : 객체 생성과 동시에 값 주입, 라이프사이클이 함께 이루어짐
			this.balance = balance;
		}
		public void setBalance(double balance) { //set 사용 : 객체 생성 후에 값 주입, 라이프사이클이 다르게 이루어짐
			this.balance = balance;
		}
		
		public double getBalance() {
			return balance;
		}
		
		//입금
		/*제어문 사용금액이 
		 * amount 1천원 이상일 때만 입금하고
		 * 그렇지 않으면 오류!...메세지...
		 */
		public void deposit(double amount) {
			//balance = amount + balance;
			if (amount >= 1000) {
					balance += amount;}
			else {
				System.out.println("1천원 이상부터 입금 가능합니다.");
				return;
			}
		}
		
		//출금
		/* 제어문 사용
		 * amount... 잔액이 1만원이면 2만원 출금이 안됨
		 * 조건 달고
		 * 안될경우 오류!... 메세지...
		 */
		public void withdraw(double amount) {
			if(balance >= amount) {
					balance -= amount;} 
			else {
				System.out.println("잔액이 출금 금액보다 적습니다.");}
				return;
		}
	}

