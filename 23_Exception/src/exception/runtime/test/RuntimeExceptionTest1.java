package exception.runtime.test;

public class RuntimeExceptionTest1 {
	public static void main(String[ ] args) {
		String[ ] str = {
		"Hello Java",
		"No, I mean it",
		"Nice to meet you"};

	int i = 0;
	while(i<4)// i<4이면 오류 .. ArrayIndexOutOfBoundsException(배열의 항목을 초과했을 때 runtime오류)
	try{
	System.out.println(str[i]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Nice Catch!!");
	}//i가 0,1,2일 경우는 정상 실행, 3일 때 오류!! 예외는 메소드 블락 안에서 Line별로 발생한다
	i++;
	System.out.println("the end...");
	}//비정상 종료
	
}
	
