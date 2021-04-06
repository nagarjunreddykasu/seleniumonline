package testng;

import org.testng.annotations.Test;

public class StaticDataProvider1 {
	
	@Test(dataProvider="getBrowser",dataProviderClass=DataProviders.class)
	public void staticDataProvider(String browser){
		System.out.println("Browser name: "+browser);
	}

}
