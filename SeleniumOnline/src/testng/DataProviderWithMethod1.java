package testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithMethod1 {
	
	//DataProvider with Method parameter
	@DataProvider
	public Object[][] getData(Method method){
		String testcase=method.getName();
		
		if(testcase.equals("scenario1")){
			return new Object[][]{{"scenario1 data"}};
		}
		else if(testcase.equals("scenario2")){
			return new Object[][]{{"scenario2 data"}};
		}
		return null;
		
	}
	
	@Test(dataProvider="getData")
	public void scenario1(String data){
		System.out.println("Scenario1 test data: "+data);
	}
	
	@Test(dataProvider="getData")
	public void scenario2(String data){
		System.out.println("Scenario2 test data: "+data);
	}
	
	

}
