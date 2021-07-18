package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * 부모 클래스 Employee로부터 모든 것을 물려 받고 
 * 자기 자신만의 멤버를 추가하는 자식클래스...
 * 
 * 생성자 호출 ---> 객체 생성
 * 
 */
public class Manager extends Employee {
	
	//자식만의 멤버를 추가
	private String dept;
	
	/*
	 * 자식 생성자... 객체 생성 알고리즘
	 * 자식생성자 { 첫라인에서 무조건 부모 기본 생성자 호출 일어난다}
	 * 
	 */
	
	public Manager(String name, MyDate birthDay, double Salary, String dept) {//자식이 생성되려할 때...
		//부모 기본 생성자 호출 필수!!!... super();
		super(name, birthDay, Salary);
		
		this.dept = dept;

	
	}
	//Method Overriding
	/*
	 * step1. 부모가 가진 기능을 물려받는다....부모가 가진 기능을 호출
	 * step2. 그걸 자신에 맞게 고쳐쓴다.
	 * 
	 * 
	 * Overriding Rule
	 * 0. 상속관계의 두 믈래스 사이에서 일어난다.
	 * 1. 메소드 선언부는 모두 일치
	 * 2. 구현부는 반드시 달라야 한다.
	 * ---> 하는일이 달라졌으므로 새로운 메소드가 만들어졌다.
	 */
	public String getDetails() {
		return super.getDetails() + ", " + dept;
	}
	
}



