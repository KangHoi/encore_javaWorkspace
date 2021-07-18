package com.encore.datatype.test;
/*
 * WhiteBoardTest1 ... Test클래스 또는 실행 클래스라 부른다.
 * 
 * Test클래스 또는 실행 클래스가 하는 일
 * 1) 객체를 생성한다. == 객체의 구성요소(식구)를 메모리에 올린다.
 * 2) 식구에 접근
 *    필드 --- 값 할당 --- 실제 값이 하드코딩되면 그것은 프로그램이 아님 --안됨
 *    메소드 --- Calling
 */
import com.encore.datatype.WhiteBoard;
public class WhiteBoardTest1 {

	public static void main(String[] args) {
		/*
		 * WhiteBoard 객체를 wb라는 이름으로 하나 생성
		 * 필드에 값을 입력
		 * 입력된 값을 출력
		 * 
		 */
		WhiteBoard wb = new WhiteBoard();//float(32), double(64)
		wb.setInfo(100, 'w', 120.0f, "Encore", "plastic", true);
		wb.printInfo();

	}

}
