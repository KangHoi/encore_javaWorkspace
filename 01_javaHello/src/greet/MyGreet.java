package greet;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d1ccbea (java_01_JavaHello)

public class MyGreet {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		
	}//main
}//class

/*
 * 01 프로젝트의 문제점
 * ::
 * Hello Java라는 인삿말만 출력하는 코드 생산된다.
 * 다른 인삿말을 출력하려면 다시 코드를 수정해야 한다.
 * -->유지보수성, 재사용성 낮은 코드/
<<<<<<< HEAD
 */
=======
//
/*main method가 없으므로 컴파일만 되는 클래스
 * 
 */

public class MyGreet {
	public String message = "안녕하세요^^"; //필드 선언 및 초기화 과정
	/*message = 필드(field) >>필드(값이 저장되는 공간) 선언
	*message는 variable(변수), "안녕하세요^^"는 value(값)
	* =: 할당(assign, 오른 쪽 값이 왼쪽 공간에 들어감)
	* String: data Type
	* => 필드 선언: Data Type + 변수명;
	*/
	
	
	public void sayHello(String name) {//method worker
		//sayHello = 메소드(method)
		//메소드 정의 = 선언부{}앞쪽 + 구현부{}안쪽
		System.out.println(message+", "+name);		
	}
}
>>>>>>> fea845f (java_02_GreetOOP)
=======
 */
>>>>>>> d1ccbea (java_01_JavaHello)
