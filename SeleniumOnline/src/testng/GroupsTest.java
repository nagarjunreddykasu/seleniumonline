package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
	
	@BeforeGroups("sanity")
	public void beforeGroups(){
		System.out.println("Before Groups code");
	}
	
	@Test(groups={"sanity"})
	public void TC_Search_01(){
		System.out.println("TC_Search_01 code");
	}
	
	@Test(groups={"sanity","regression"})
	public void TC_Search_02(){
		System.out.println("TC_Search_02 code");
		System.out.println(10/0);
	}
	
	@Test(groups={"regression"})
	public void TC_Search_03(){
		System.out.println("TC_Search_03 code");
	}
	
	@Test(groups={"regression"})
	public void TC_Search_04(){
		System.out.println("TC_Search_04 code");
	}
	
	@Test(groups={"regression"})
	public void TC_Search_05(){
		System.out.println("TC_Search_05 code");
	}
	
	@Test(dependsOnGroups={"sanity"})
	public void TC_Search_06(){
		System.out.println("TC_Search_06 code");
	}
	
	@AfterGroups("sanity")
	public void afterGroup(){
		System.out.println("After group code");
	}
	
	
	

}
