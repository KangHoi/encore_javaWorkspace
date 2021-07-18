package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//1. 객체생성...Programmer의 식구들을 메모리에 올린다.
		//2. 메소드 호출...
		//3. 개발자의 정보가 콘솔창에 출력되도록 작성
		//birthday의 정보가 1980-1-1
		
		/*
		 * Programmer pro = new Programmer(); Programmer pro1 = new Programmer();
		 * 
		 * 
		 * MyDate md = new MyDate(); md.setDate(1980, 1, 1);
		 * 
		 * pro.setProgrammer("James", md, 300000.0F, 1000); pro1.setProgrammer("Peter",
		 * md, 400000.0F, 2000);
		 * 
		 * 
		 * pro = pro1; System.out.println(pro.getProgrammer());//get은 주입된 값을 받아옴
		 * System.out.println(pro1.getProgrammer());
		 */
		
		//step2
		/*
		 * 1. pro1, pro2 객체를 생성...
		 * 2. 생성자를 이용해 필드에 직접 값 할당한다.
		 * 3. 필드 정보를 콘솔창으로 출력..
		 * 4. Peter의 연봉은 450000.0달러 입니다. 출력이 되도록 로직을 완성하세요
		 * 
		 * 
		 */
		
		//step2
		Programmer pro1 = new Programmer("James", new MyDate(1980,1,1), 300000.0F, 1000);
		Programmer pro2 = new Programmer("Peter", new MyDate(1980,1,1), 400000.0F, 1000);

		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer());
		
		System.out.println("\n======================\n");
		System.out.println(pro2.getName()+"님의 연봉은 " +pro2.getAnnualSalary());
	}
	

}
