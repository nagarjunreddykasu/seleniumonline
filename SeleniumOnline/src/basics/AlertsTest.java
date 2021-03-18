package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {


	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//#content > div > ul > li:nth-child(1) > button
		//*[@id="content"]/div/ul/li[1]/button
		
		//button[contains(text(),'JS Alert')]
		
		driver.findElement(By.xpath("//button[contains(text(),'JS Alert')]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String actualAlertMessage=alert.getText();
		
		System.out.println("Alert message: "+actualAlertMessage);
		Thread.sleep(2000);
		alert.accept();
		
		//getText()
		//accept() //to click on OK button
		//dismiss() //to click on Cancel buton
		//sendKeys() //to enter data in text field of prompt
		
		
		
		




	}

}
