package streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter(System.getProperty("user.dir")+"\\src\\streams\\Output.txt");
		String str="Core Java Training";
		
		fw.write(str);

		fw.close();
		
		System.out.println("Data Written");
	}

}
