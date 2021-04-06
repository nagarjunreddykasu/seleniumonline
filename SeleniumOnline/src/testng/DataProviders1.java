package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders1 {
	
	
	@Test(dataProvider="getData")
	public void instanceDataProvider(String username,String password){
		System.out.println(username+"\t"+password);
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="user1@gmail.com";
		obj[0][1]="Test@123";
		
		obj[1][0]="user2@gmail.com";
		obj[1][1]="Abc@321";
		
		
		obj[2][0]="user3@gmail.com";
		obj[2][1]="!bcd@345";
		
		return obj;
	}
	
	
	

}



/*

instance dataprovider-> defined in the same class


static dataprovider -> defined in other class with static keyword.




*/