package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//3 ways
		/*
		 index
		 name or id value
		 webelement
		 driver.switchTo().frame(4);
		 
		 */
		
		//driver.switchTo().frame("mce_0_ifr");
		
		//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Count of frames: "+count);
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Selenium Training");
	}

}
