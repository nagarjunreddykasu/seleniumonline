package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://qa.circulus.io/login.aspx");
		//driver.findElement(By.id("TxtEmail")).sendKeys("NAGARJUN");
		
		
		/*
		Press shift key
		send desired text
		release shift key
		
		Modifier keys: Shift Ctrl Alt
		 */
		
		WebElement username=driver.findElement(By.id("TxtEmail"));
		Actions actions=new Actions(driver);
		actions.keyDown(username, Keys.SHIFT).sendKeys("nkasu@frontier.com").keyUp(Keys.SHIFT).perform();
		
		username.clear();
		username.sendKeys("nkasu@frontier.com");
		
		username.sendKeys(Keys.TAB);
		
		WebElement password=driver.findElement(By.id("TxtPassword"));
		password.sendKeys("xeno@1234");
		
		password.sendKeys(Keys.ENTER);
		
		//password.sendKeys(Keys.Con);
		/*String str="username";
		str.toUpperCase();
		*/
		
		
		
	}

}
