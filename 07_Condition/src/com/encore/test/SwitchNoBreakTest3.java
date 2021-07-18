package com.encore.test;

import java.util.Scanner;

public class SwitchNoBreakTest3 {

	public static void main(String[] args) {//실행...
		/*
		 *메인메소드인 실행 메소드의 역할
		 * 1. 객체 생성...식구를 메모리에 올린다.
		 * 2. 메소드 호출... 그리고 식구를 호출한다
		 * 결과적으로 메모리에 안올라간 놈은 사용할 수 없다.
		 * 사용하려면 메모리를 올려야 한다. == 객체 생성
		 * 
		 * 내가 객체를 생성하지 많고 바로 사용할 수 있는 것들이 있다.
		 * 이미 메모리에 올라가 있다... static한 성질의 것들은 미리 올라가 있다.
		 * 
		 */
		int time = (int)(Math.random()*4)+8; //8~11까지 출력되도록 응용
		System.out.println("[현재시간: "+ time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근을 준비합니다...");
		case 9:
			System.out.println("회사 도착, 오전 회의 합니다...");
		case 10:
			System.out.println("오전 업무를 봅니다.");
		case 11:
			System.out.println("외근나갑니다.");
		}//break를 쓰지 않으니 스케줄처럼 사용 가능
	}

}
