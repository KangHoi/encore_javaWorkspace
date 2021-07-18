package exception.runtime.test;

public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		//객체 생성하지 않고 참조변수로 접근할 때 발생하는 예외
		System.out.println("===================== NullPointExcepiton ===================");
		String str = "Encore";
		String str1 = new String("Encore");
		str1 = null; //객체 생성을 하지 않은 것과 동일한 결과 발생
		try {
			System.out.println("문자열 길이를 반환합니다" + str1.length()); //에러발생
			System.out.println("toString() 스트링에서는 오버라이딩 되어있다" + str1.toString());

		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잡았다..!");
//		} catch(NullPointerException e1) {
//			System.out.println("잡았다..!!");
		}finally {//위와 상관없이 무조건 이 부분 수행
			System.out.println("Always print...");
		}
		
		
	}

}
