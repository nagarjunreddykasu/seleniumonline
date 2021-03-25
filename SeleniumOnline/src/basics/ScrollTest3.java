package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest3 {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("URL");
		driver.findElement(By.id("emailId")).sendKeys("<username>");
		driver.findElement(By.id("password")).sendKeys("<password>");
		driver.findElement(By.id("loginSubmit")).click();
		Reusable.wait(driver, By.id("documentDetailsExceptionCount"));
		driver.findElement(By.id("documentDetailsExceptionCount")).click();
		Thread.sleep(5000);
		WebElement assignedTo=driver.findElement(By.id("jqGrid_assigned_To_Id"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", assignedTo);
	}

}
