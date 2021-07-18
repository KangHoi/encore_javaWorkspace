package fly.test;

import fly.child.Airplane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

public class FlyerTest1 {

	public static void main(String[] args) {
		//1. polymorphism 방식으로 자식 객체 3개 생성... bird, superman, airplane
		//인터페이스는 객체 생성의 대상이 아니고 객체를 생성하기 위한 타입으로서만 존재한다!!!
		//Flyer flyer = new Flyer(); .. 오류
		
		Flyer bird = new Bird();
		Flyer superman = new SuperMan();
		Flyer airplane = new Airplane();
		
		//2. for, instanceof 이용해 각각 자식클래스 기능 전부 호출
		Flyer[ ] flyers = {bird, superman, airplane};
		for(Flyer f : flyers) {
			if(f instanceof Bird) System.out.println(((Bird) f).layEggs());
			if(f instanceof SuperMan) System.out.println(((SuperMan) f).stop_Bullet());
			f.fly();
			f.land();
			f.take_off();
			System.out.println("===================================================");
		}//for
		

	}//main

}//class
