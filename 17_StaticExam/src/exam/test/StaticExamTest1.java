package exam.test;
/*
 * =========== static한 키워드 성질 ==============
 * 1. 객체생성 과정 없이 메모리에 올라간다.
 * 2. 객체생성 과정 훨씬 이전에...Class File Loader과정에서...이때 메모리 올라간다.
 *    JVM(STACK | HEAP(new 키워드로 생성된 객체만 올라감) | ... Class Area(static한 성질들의 멤버))
 * 3. static한 성질의 필드는 생성된 객체들에서 서로 공유한다!!!
 * 4. static은 static끼리 통한다
 * 5. static은 블락 안에서 this 사용 못함
 * 6. static과 final은 성질 상 종종 함께 사용된다.
 *    ex) 상수 값 선언 static final int BASIC_SALARY = 1000;
 * 7. static initialization block
 * 8. singletone
 */

class Member{
	//필드 레벨에 static변수를 선언(local level로는 사용할 수 없음)
	static String name = "홍길동"; //스태틱
	static int age =22; //스태틱
	
	int count =1; //필드
	
	
	//static block
	public static void getMember() {//static block
		System.out.println("우/유/빛/깔/"+ name);//static variable
		//System.out.println("우/유/빛/깔/"+ count);
	}
	//non-static block
	public void getMember2() {//static block
		System.out.println("우/유/빛/깔/"+ name);//static variable
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		//static한 성질의 기능은 바로 접근해서 사용 가능... 
		//Class이름, static  메소드
		Member.getMember();
		
		//
		Member m = new Member();
		m.getMember();
		m.getMember2();

	}

}
