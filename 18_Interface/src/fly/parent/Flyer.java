package fly.parent;
//날으는 것과 관련된 추상기능을 모아놓은 인터페이스
/*
 * 인터페이스의 구성요소
 * 1. static final 상수
 * 2. public abstract 메소드
 */
public interface Flyer {
	//필드 없다.. 상수는 존재
	public static final int SIZE =100;
	
	public abstract void fly(); //abstract method... 선언부만 있고 구현부{}가 없는 메소드
	void land(); //무조건 메소드 리턴 타입 앞에 public abstract 생략된다.
	void take_off();
	

}
