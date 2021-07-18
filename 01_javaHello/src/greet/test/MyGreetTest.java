package greet.test;

import greet.MyGreet;//JVM이 클래스를 찾을 때 import 필수
//MyGreet을 greet에서 찾아라
/*
 * MyGreet 클래스의 메소드를 동작시키는 실행 클래스...Test 클래스
 * 
 * 1. 클래스 객체를 생성 == 구성요소들이 메모리에 올라간다
 * 2. 접근
 *   1)필드 --- 값 할당
 *   2)메소드 --- 호출(calling)
 */
public class MyGreetTest {
	//test 클래스 = 실행클래스
	//만든 모듈을 메모리에 올리는 작업만하는 test클래스

	public static void main(String[] args) {//1
		//객체를 생성
		/*
		 * 메모리에 mg라는 이름으로 객체가 올라간다... 
		 * 클래스의 식구들이 올라간다.
		 * 2개... 필드1개, 메소드 1개
		 * 
		 * 메모리 올리는 이유(객체 생성하는 이유)??
		 * 메모리 올라간 애들만 접근해서 사용 가능하다.
		 */
		MyGreet mg = new MyGreet();
		mg.sayHello("강지원"); //method calling
		//mg는 MyGreet에 있는 sayHello를 호출(Calling)한다.
		//method는 calling 해야만 working 한다
		

	}

}
