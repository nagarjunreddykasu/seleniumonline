package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("URL");
		driver.findElement(By.id("TxtEmail")).sendKeys("username");
		driver.findElement(By.id("TxtPassword")).sendKeys("password");
		driver.findElement(By.id("BtnLogin")).click();

		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		
		Reusable.click(driver, By.id("cpBody_ddlAutoCompExt_btn_comb"));
		Reusable.click(driver, By.cssSelector(".divAddVendorTemp"));
		
		Reusable.click(driver, By.id("cpBody_userNewVendor_cVbtnSubmit"));
		String validationMsg=Reusable.getText(driver, By.xpath("//*[@id='cVservices']/div[1]/div/div[1]/div/div[1]/div/div"));
		System.out.println("Actual Validation Message: "+validationMsg);
		
		Reusable.sendKeys(driver, By.id("cpBody_userNewVendor_cVtxtVendorName"), "QA_Vendor1");
		
		Reusable.sendKeys(driver, By.name("ctl00$cpBody$userNewVendor$cVtxtFirstName"), "Nagarjun Reddy");
		Reusable.sendKeys(driver, By.name("ctl00$cpBody$userNewVendor$cVtxtLastName"), "K");
		Reusable.sendKeys(driver, By.name("ctl00$cpBody$userNewVendor$cVtxtEmail"), "nagarjun.sdet@gmail.com");
		Reusable.click(driver, By.id("cpBody_userNewVendor_cVbtnSubmit"));
		
		
		
	}

}
