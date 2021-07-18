package exam.test;
//static initialization block...
//초기화...

public class staticExamTest3 {
	static int i =0;
	
	
	public static void main(String[] args) {
		//실질적으로 이 부분이 가장 먼저 실행된다.. 여기에 초기화 알고리즘을 넣는다
		//객체 생성... (); 생성자 호출... 필드 초기화

		
		System.out.println("1. main method static block..." + i);
	}//main
	
	static {
		i = 300;
		System.out.println("2. static initilization block..." + i);
	}//메인보다 먼저 작동한다. 완벽한 초기화 실행 가능
	
}
