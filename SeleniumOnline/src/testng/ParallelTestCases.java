package testng;

import org.testng.annotations.Test;

public class ParallelTestCases {
	
	@Test
	public void TC_Login_01(){
		System.out.println("TC_Login_01 code");
	}
	
	@Test
	public void TC_Login_02(){
		System.out.println("TC_Login_02 code");
	}
	
	@Test
	public void TC_Login_03(){
		System.out.println("TC_Login_03 code");
	}

}
