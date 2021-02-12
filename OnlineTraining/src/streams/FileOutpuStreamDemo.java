package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpuStreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream out=new FileOutputStream(System.getProperty("user.dir")+"\\src\\streams\\Output.txt");
		
		String str="Selenium with Java programming";
		//byte[] arr=str.getBytes();
		
		out.write(str.getBytes());
		
		out.close();
		
		
	}

}
