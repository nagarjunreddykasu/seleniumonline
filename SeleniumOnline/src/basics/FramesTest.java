package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("iFrame")).click();
		
		int count=driver.findElements(By.tagName("iFrame")).size();
		System.out.println("iFrame count: "+count);
		
		driver.switchTo().frame("mce_0_ifr");
		//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		//driver.switchTo().frame(0);
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Selenium Training");

	}

}
