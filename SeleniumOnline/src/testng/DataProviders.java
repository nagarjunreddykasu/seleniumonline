package testng;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="getBrowser")
    public static Object[][] getBrowser() {
        return new Object[][]{{"chrome"}};     
    }
	
	@DataProvider
    public static Object[][] getData() {
        return new Object[][]{{"nkasu@frontier.com","xeno@123$","invpwd"}, {"nkasu@gmail.com","Test@123","invuser"},
        	{"nagarjun","Abc@1234","invEmail"},{"","","blank"}};
    }
	
	@DataProvider(name="TestData")
	public static Object[][] getTestData(ITestContext context){
		
		String testName=context.getName();
		if(testName.equals("SanityTest")){
			return new Object[][]{{"nkasu@frontier.com","xeno@123$","invpwd"}, {"nkasu@gmail.com","Test@123","invuser"},
	        	{"nagarjun","Abc@1234","invEmail"},{"","","blank"}};
		}
		else if(testName.equals("RegressionTest")){
			return new Object[][]{{"Nagarjun Reddy","K","nagarjun.sdet@gmail.com"}, {"Selenium user","Test","seleniumuser@gmail.com"}};
		}
		
		return null;
		
		
	}
	

}
