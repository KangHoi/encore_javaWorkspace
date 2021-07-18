package exception.runtime.test;

public class RuntimeExceptionTest3 {
	public static void main(String[ ] args) {
		String[ ] str = {
				"Hello Java",
				"No, I mean it",
				"Nice to meet you"
		};
		
		int i = 0;
		while(i<4)// i<4이면 오류 .. ArrayIndexOutOfBoundsException(배열의 항목을 초과했을 때 runtime오류)
			try{
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch!!");
			}catch(Exception e) {
				System.out.println("Nice Catch2!!");
			}
			i++;
	}

	}