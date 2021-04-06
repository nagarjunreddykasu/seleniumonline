package testng;

import org.testng.annotations.Test;

public class ListenerTest1 {
	
	
	@Test
	public void TC_Login_01(){
		System.out.println("TC_Login_01 test case");
		System.out.println(15/0);
	}
	
	@Test
	public void TC_Login_02(){
		System.out.println("TC_Login_02 test case");
	}

}
