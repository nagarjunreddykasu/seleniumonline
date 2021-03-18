package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
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
		
	//	Wait w=new FluentWait<WebDriver>(driver).withTimeout(timeout)
		
		
		
	}

}
