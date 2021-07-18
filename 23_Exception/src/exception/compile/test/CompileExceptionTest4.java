package exception.compile.test;
//1.try~catch 2. throws 3. main...
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CompileExceptionTest4 {
	public static void main(String[] args) {
		String path = "C:\\encore_kjw\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. Filereader 객체 생성...");
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader의 기능을 이용해 파일의 내용을 읽어들인다..");
			fr.read();
			
	
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {//finally block은 무조건 실행. 아래 두 경우 제외하고
			//1)finally block안에서 또 다른 예외 발생 시 실행 안됨
			//2) finally block 실행 도중 pc전원이 갑자기 꺼지는 경우 실행 안됨
			try {
				fr.close();//이 코드가 상당히 중요하다.
			} catch(IOException e) {
				
			}

			
		}
	}

}
