package fly.child;
/*
 * 인터페이스를 부모로 둔 자식 클래스는 
 * 반드시 부모 인터페이스가 가지고 있는 모든 추상메소드를
 * 다 구현해야한다
 */

import fly.parent.Flyer;

public class Airplane implements Flyer {

	public void fly() {
		System.out.println("Airplane...fly...");
		
	}

	public void land() {
		System.out.println("Airplane...land...");
		
	}

	public void take_off() {
		System.out.println("Airplane...take_off...");
		
	}


}
