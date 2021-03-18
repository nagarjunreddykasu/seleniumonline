package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void wait(WebDriver driver,By locator){
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void main(String[] args) {

		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait (globally)
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));*/
		
		wait(driver,By.xpath("//h4[contains(text(),'Hello World!')]"));
		
		//Thread.sleep(5000);
		
		String message=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText();
		System.out.println("Message: "+message);
		
	}

}


/*
1. ImplicitWait


2. ExplicitWait
Wait interface
 i. WebDriverWait
 ii. FluentWait



Thread.sleep(2000); //java




 */