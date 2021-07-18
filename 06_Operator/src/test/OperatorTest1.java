package test;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5; //지역 변수 (로컬 변수)로 사용할 경우 기본값 없으므로 반드시 초기화 하고 사용
		int j = 3; // 메소드 블록 안에 있으므로 지역 변수
		
		Operator o1 = new Operator(); //객체생성의 결론: 주소값 할당
		Operator o2 = new Operator();
		
		
		// ==(same)
		o1 = o2; //=(assign)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1 == o2); //false,true
		
		
		// %... mod .. 나눗셈에서 나머지
		System.out.println("연산자 % :: " + i%j); //2
		System.out.println(i==j);//false
		System.out.println(i!=j);//true
		
		//++(1씩 증가), --(1씩 감소)
		int k = 10;
		System.out.println(k++);//10...1이 나중에 증가
		System.out.println(k);//11
		
		int m = 10;
		System.out.println(++m);//11...1이 먼저 증가
		System.out.println(m);//11
		
		//논리 연산자(Short Circuit과 결과 같음)
		System.out.println(o1.test1() | o1.test2());//true
		System.out.println("#####################################");
		System.out.println(o1.test2() & o1.test1());//false
		
		System.out.println("=========================================");
		
		//Short Circuit(지름길... 앞쪽의 결과가 곧 결과임...예외를 건너뛸 수 있다..더 유용)
		System.out.println(o1.test1() || o1.test2());//true
		System.out.println("#####################################");
		System.out.println(o1.test2() && o1.test1());//false
	}//main
}//class


class Operator{
	public boolean test1() {
		System.out.println("test1() Calling....");
		return true;
		
	}	
	public boolean test2() {
		System.out.println("test2() Calling....");
		return false;
		
	}
}