package exception.compile.test;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\encore_kjw\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. Filereader 객체 생성...");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader의 기능을 이용해 파일의 내용을 읽어들인다..");
			fr.read();
			
	
		
		} finally {
				fr.close();//이 코드가 상당히 중요하다.
			} 

	}

}
