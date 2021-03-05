package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {
	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis=new FileInputStream("D:\\SeleniumOnline\\OnlineTraining\\src\\collections\\objectrepository.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\collections\\objectrepository.properties");
		
		Properties p=new Properties();
		p.load(fis);
		
		System.out.println(p.getProperty("url"));//http://www.facebook.com
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
	}

}
