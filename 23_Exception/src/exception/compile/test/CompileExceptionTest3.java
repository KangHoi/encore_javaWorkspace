package exception.compile.test;
//1.try~catch 2. throws 3. main...
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading3{
	
	public void readFile(String filename) throws FileNotFoundException{
	
			FileReader fr = new FileReader(filename);
			System.out.println("...new Filereader()..filename..");			

		System.out.println("FileReader Creating....");
	}
}
public class CompileExceptionTest3 {
	public static void main(String[] args) throws FileNotFoundException{
		FileReading3 f = new FileReading3();
		String path = "C:\\encore_kjw\\util\\poem.txt";
		
			f.readFile(path);
		
		System.out.println("������ �� �о�鿴���ϴ�..");
	}

}
