package exception.compile.test;
//1.try~catch 2. throws 3. main...
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest4 {
	public static void main(String[] args) {
		String path = "C:\\encore_kjw\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. Filereader ��ü ����...");
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader�� ����� �̿��� ������ ������ �о���δ�..");
			fr.read();
			
	
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {//finally block�� ������ ����. �Ʒ� �� ��� �����ϰ�
			//1)finally block�ȿ��� �� �ٸ� ���� �߻� �� ���� �ȵ�
			//2) finally block ���� ���� pc������ ���ڱ� ������ ��� ���� �ȵ�
			try {
				fr.close();//�� �ڵ尡 ����� �߿��ϴ�.
			} catch(IOException e) {
				
			}

			
		}
	}

}
