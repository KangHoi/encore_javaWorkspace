package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String filename) {
		try {
			FileReader fr = new FileReader(filename);
			System.out.println("...new Filereader()..filename..");			
		} catch(FileNotFoundException e) {
//			System.out.println("Nice Catch");
			//1. ����ΰų�
			//2. printStackTrac(), getMessage()
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		System.out.println("FileReader Creating....");
	}
}
public class CompileExceptionTest1 {
	public static void main(String[] args) {
		FileReading f = new FileReading();
		String path = "C:\\encore_kjw\\util\\poem.txt";
		f.readFile(path);
		System.out.println("������ �� �о�鿴���ϴ�..");
	}

}