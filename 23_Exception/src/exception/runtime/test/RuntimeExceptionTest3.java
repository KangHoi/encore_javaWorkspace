package exception.runtime.test;

public class RuntimeExceptionTest3 {
	public static void main(String[ ] args) {
		String[ ] str = {
				"Hello Java",
				"No, I mean it",
				"Nice to meet you"
		};
		
		int i = 0;
		while(i<4)// i<4�̸� ���� .. ArrayIndexOutOfBoundsException(�迭�� �׸��� �ʰ����� �� runtime����)
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