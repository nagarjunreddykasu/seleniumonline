package testng;

import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test(priority=0,invocationCount=10)
	public void login(){
		System.out.println("login test cases");
		System.out.println(10/0);//Arithmetic exception
	}

	@Test(priority=1)
	public void dashboard(){
		System.out.println("dashboard test case");
	}
	
	@Test(priority=2,enabled=false)
	public void search(){
		System.out.println("search test cases");
	}
	
	@Test(priority=3,dependsOnMethods={"login","dashboard"})
	public void reports(){
		System.out.println("reports test cases");
	}
	
	

}
