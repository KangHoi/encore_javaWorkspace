package exception.compile.test;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\encore_kjw\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. Filereader ��ü ����...");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader�� ����� �̿��� ������ ������ �о���δ�..");
			fr.read();
			
	
		
		} finally {
				fr.close();//�� �ڵ尡 ����� �߿��ϴ�.
			} 

	}

}
