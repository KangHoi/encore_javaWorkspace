package com.encore.test1;

import java.util.Scanner;

/*
 * kim's --- 4입력받기
 * 1 - 2 - 3 - 4
 * 
 * lim's --- 8입력받기
 * 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8
 */

public class HalfDistanceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kim이 이동할 거리를 입력하세요...");
		int k = sc.nextInt();
		System.out.println("Lim이 이동할 거리를 입력하세요...");
		int l = sc.nextInt();
		
		int result = halfdistance(k, l, n);
		System.out.println(result);

	}
	public static int n = 1;
	private static int halfdistance(int k, int l, int n) {
		// 직접 구현해보세요!!

	
			while(k==1 && l==1) {
				if(k==l) break;
				if((k/=2) == (l/=2)) n++;
				
			}
			return n++;
}
}
