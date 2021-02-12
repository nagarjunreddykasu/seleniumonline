package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
	//	FileInputStream fis=new FileInputStream("D:\\SeleniumOnline\\OnlineTraining\\src\\streams\\TestData.txt");
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\streams\\TestData.txt");
		
		//System.out.println((char)fis.read());
		System.out.println();
		System.out.println("Count of characters: "+fis.available());
		
		int i=0;
		while((i=fis.read()) != -1){
			System.out.print((char)i);
		}
	
		
		
		
		//Apache POI
		
		
		
		fis.close();
		
	}


}
