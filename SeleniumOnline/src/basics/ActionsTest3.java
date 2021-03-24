package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest3 {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@1234");
		driver.findElement(By.id("BtnLogin")).click();
		
		
		WebElement billsMenu=driver.findElement(By.id("menu_aBills"));
		Actions act=new Actions(driver);
		act.moveToElement(billsMenu).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Bills")).click();
		
		
		WebElement toolTipIcon=driver.findElement(By.xpath("//*[@id='cpBody_divXTBDE']/label[2]/a/img"));
		new Actions(driver).moveToElement(toolTipIcon).perform();
		
		String tooltipMessage=toolTipIcon.getAttribute("title");
		System.out.println("Tooltip Message: "+tooltipMessage);
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.PAGE_UP).perform();
		
		
		//act.contextClick(driver.findElement(By.id("cpBody_btnBeginDEWithoutImg"))).perform();
		
		//act.doubleClick(elment).perform();  //To double click on any element
		
		
		
	}

}
