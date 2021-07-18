package com.encore.test;

public class TriangleNumberTest {

	public static void main(String[] args) {
		// 직각삼각형
		System.out.println("문제 1)");
		System.out.println();
		
		int n =0;
		for (int i = 1; i <= 5; i++) {							
			for (int j = 1; j <= i - 1; j++) {			
				System.out.print("   ");
			}
			for (int j = 1; j <= 5 - i + 1; j++) {	
				System.out.printf("%3d" , ++n);			
			}
			System.out.println();						
		}
		
		
	}
}