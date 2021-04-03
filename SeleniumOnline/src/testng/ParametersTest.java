package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	
	@Parameters({"url"})
	@BeforeClass
	public void beforeClass(String url){
		System.out.println("Before Class code");
		System.out.println(url);
		//driver.get(url);
	}
		
	
	//@Parameters({"url"})
	@Test
	public void TC_Login_01(){
		System.out.println("TC_Login_01");
	}
	
	@Test
	public void TC_Login_02(){
		System.out.println("TC_Login_02");
	}
	
	@Test
	public void TC_Login_03(){
		System.out.println("TC_Login_03");
	}
	

}
