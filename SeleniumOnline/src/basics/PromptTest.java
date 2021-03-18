package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptTest {
	
	public static String getAlertMessage(WebDriver driver){
		/*Alert al=driver.switchTo().alert();
		String actualPromptMessage=al.getText();
		return actualPromptMessage;*/
		
		return driver.switchTo().alert().getText();
	}
	
	public static void clickOK(WebDriver driver){
		driver.switchTo().alert().accept();
	}
	
	public static void clickCancel(WebDriver driver){
		driver.switchTo().alert().dismiss();
	}
	
	public static void sendKeysAlert(WebDriver driver, String value){
		driver.switchTo().alert().sendKeys(value);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'JS Prompt')]")).click();
		
		/*Alert al=driver.switchTo().alert();
		String actualPromptMessage=al.getText();
		System.out.println("Prompt Message: "+actualPromptMessage);*/
		
		
		String actualMessage=getAlertMessage(driver);
		System.out.println(actualMessage);
		
		Thread.sleep(2000);
		//al.sendKeys("Selenium Training");
		sendKeysAlert(driver,"Selenium Training");
		
		Thread.sleep(2000);
		//al.accept();
		clickOK(driver);
		
		
		//al.dismiss();
		clickCancel(driver);
		
		
		
		
	}

}
