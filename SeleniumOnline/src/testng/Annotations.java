package testng;

import org.testng.annotations.Test;

public class Annotations {
	
	
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



/*

Annotations:
------------
@Test

@BeforeSuite
@AfterSuite
@BeforeTest
@AfterTest
@BeforeClass
@AfterClass
@BeforeMethod
@AfterMethod
@BeforeGroups
@AfterGroups
@Parameters
@DataProvider



*/