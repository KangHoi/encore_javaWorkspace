package com.encore.test1;

import java.util.Scanner;

/*
 * Scanner 객체를 통해 
 * 10~99 사이의 정수를 하나 입력받는다. (두 자리 숫자)
 * 
 * 3,6,9... 즉 3의 배수 값이 포함되어져 있는지를 패턴으로 적용하는 알고리즘.
 * 하나 있으면 --> @
 * 두개 있으면 --> @@
 * 없으면     --> 숫자 리턴
 * 예를 들어
 * 
 * 31 --> @
 * 11 --> 11
 * 98 --> @
 * 29 --> @
 * 96 --> @@
 * 
 * 힌트
 * 2자리 수...
 * 앞자리 --- /
 * 끝자리 --- %
 * 
 * 제어문 연습하기
 * 
 */

public class Pattern369Test {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 숫자를 입력하세요...");
		int i = sc.nextInt();
		if(i>=10 && i<=99) {
			int x = i % 10;//1의 자리
			int y = i / 10;//10의 자리
				if((x==3 || x==6 || x==9) && (y==3 || y==6 || y==9)) {
					System.out.println("@@");
					} 
				else if ((x==3 || x==6 || x==9) || (y==3 || y==6 || y==9)) {
					System.out.println("@");
					} 
				else System.out.println(i);
					
				}
		else System.out.println("두 자리가 아닙니다...");
		
			
		}



	}
