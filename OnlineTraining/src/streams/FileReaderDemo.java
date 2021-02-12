package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\streams\\TestData.txt");
		
		int i=0;
		while((i=fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
		
	}

}
