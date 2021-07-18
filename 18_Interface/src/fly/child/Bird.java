package fly.child;
/*
 * 인터페이스를 부모로 둔 자식 클래스는 
 * 반드시 부모 인터페이스가 가지고 있는 모든 추상메소드를
 * 다 구현해야한다
 */

import fly.parent.Flyer;

public class Bird implements Flyer {

	public void fly() {
		System.out.println("Bird...fly...");
		
	}

	public void land() {
		System.out.println("Bird...land...");
		
	}

	public void take_off() {
		System.out.println("Bird...take_off...");
		
	}
	
	//자식만의 메소드...
	public String layEggs() {
		return "새가 알을 까다";
	}
	

}
