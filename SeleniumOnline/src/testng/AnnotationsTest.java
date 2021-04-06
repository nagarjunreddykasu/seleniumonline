package testng;

import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test(priority=0)
	public void login(){
		System.out.println("login test case");
	}
	
	@Test(priority=1)
	public void dashboard(){
		System.out.println("dashboard test case");
	}
	@Test(priority=2,enabled=false)
	public void search(){
		System.out.println("search test case");
	}
	
	
	
	

}
