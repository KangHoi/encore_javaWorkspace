package com.encore.algo.test;

import java.util.Scanner;

public class ArrayPersonTypeTest {

	public static void main(String[] args) {
		//풀어보세요...
		//GitLab <폴더명 02_javaWorkshop 만들어서
		//폴더 안에 ~.java ... commit
		
		Scanner sc= new Scanner(System.in);
		System.out.println("성격유형 검사에 참여한 사람은 모두 몇 명입니까?");
		int num =sc.nextInt();
		
		
		int[ ] types = new int[num];
		System.out.println("1~5 사이 해당하는 성격유형을 입력하세요...");
		for(int i=0; i<types.length; i++) {
			types[i] = sc.nextInt();
		}
		
		
		int mode =0;
		int[ ] index = new int[types.length];
		int max = 0;
		for(int j =0;j< types.length; j++ ) {
			index[types[j]]++;
		}
		for(int j=0;j<index.length;j++) {
			if(max<index[j]) {
				max = index[j];
				mode = j;
			}
		}
		
		System.out.println("가장 빈번한 성격유형: " + mode );
		
		
		

	}

}
