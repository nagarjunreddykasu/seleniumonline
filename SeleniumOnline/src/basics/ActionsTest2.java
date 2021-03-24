package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest2 {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@1234");
		driver.findElement(By.id("BtnLogin")).click();

		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		
		WebElement billNumber=driver.findElement(By.id("cpBody_txtBill"));
		billNumber.sendKeys("03242021-1");
		
		Actions act=new Actions(driver);
		act.keyDown(billNumber, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement description=driver.findElement(By.id("cpBody_txtCheckMemo"));
		act.keyDown(description,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
