package com.encore.test;
/*
 * Collection(집합)
 * 1. Homogeneous Collection(동종 간의 집합체)
 * 2. Heterogeneous Collection(이기종 간의 집합체)
 */

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class HeterogeneousCollectionTest3 {

	public static void main(String[] args) {
		
		Employee[ ] emps = {
				new Employee("James", new MyDate(1982,3,2), 23000.0),
				new Manager("Robert", new MyDate(198,4,2), 33000.0, "IT"),
				new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "Java",200),
				new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert")
	};
		/*
		 * for문과 instanceof를 사용해
		 * Robert의 부서를 IT-->Marketing으로 변경
		 * Gosling의 tech를 Java-->Python으로 변경
		 * Peter bossOfName을 Robert -->Gosling으로 변경
		 */
		
		for(Employee e : emps) {
			if(e instanceof Manager) ((Manager) e).changeDept("Marketing");				
			if(e instanceof Engineer) ((Engineer) e).changeTech("Python");
			if(e instanceof Secretary) ((Secretary) e).changeBossOfName("Gosling");
			
			System.out.println(e.getDetails());
		}

}
}

/*
 * 
 * 
 * Polymorphism
 * 
 * 1. Hetero...collection
 * 2. Virtual Method Invocation
 * 3. Object Casting
 * 4. 부모타입으로 동일하게 묶여져 있지만.. 각각 실질적으로 생성된 객체타입을 알아내기 위한 키워드 필수
 * 	  if(e instanceof 자식클래스명) //instanceof는 키워드므로 전부 소문자
 * 
 * 
 * 
 * 
 * 
 */

	


