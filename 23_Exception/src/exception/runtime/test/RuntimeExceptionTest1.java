package exception.runtime.test;

public class RuntimeExceptionTest1 {
	public static void main(String[ ] args) {
		String[ ] str = {
		"Hello Java",
		"No, I mean it",
		"Nice to meet you"};

	int i = 0;
	while(i<4)// i<4�̸� ���� .. ArrayIndexOutOfBoundsException(�迭�� �׸��� �ʰ����� �� runtime����)
	try{
	System.out.println(str[i]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Nice Catch!!");
	}//i�� 0,1,2�� ���� ���� ����, 3�� �� ����!! ���ܴ� �޼ҵ� ��� �ȿ��� Line���� �߻��Ѵ�
	i++;
	System.out.println("the end...");
	}//������ ����
	
}
	
