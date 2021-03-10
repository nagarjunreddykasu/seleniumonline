package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsActions {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		WebElement username=driver.findElement(By.id("TxtEmail"));
		username.sendKeys("nagarjun.sdet@gmail.com");
		
		driver.findElement(By.name("TxtPassword")).sendKeys("Test@123");
		
		//driver.findElement(By.id("BtnLogin")).click();
		
		//*[@id="divLogo"]/h3/a				#divLogo > h3 > a
		//Sign Up
		
		
		//driver.findElement(By.linkText("Sign Up")).click();
		
		username.clear();
		driver.findElement(By.name("TxtPassword")).clear();
	}

}
