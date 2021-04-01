package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations2 {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method code");
	}
	
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
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method code");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before class code");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After class code");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before test code");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After test code");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before suite code");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After suite code");
	}
	
	
	
	

}
