package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {

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

		driver.findElement(By.cssSelector(".input-group-btn")).click();
		Thread.sleep(3000);
		String filePath=System.getProperty("user.dir")+"\\upload\\QA_AA_INV50714.pdf";
		/*StringSelection sel=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);*/
		//robot.keyPress(KeyEvent.VK_CANCEL);
		
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		Reusable.uploadRobot(filePath);
		
		driver.findElement(By.id("cpBody_lblUploadText")).click();
		
		String msg=driver.findElement(By.id("cpBody_Sucmsg")).getText();
		
		System.out.println(msg);
		






	}

}


/*

keyPress(KeyEvent.VK_A)
keyPress(KeyEvent.VK_0)
keyPress(KeyEvent.VK_SHIFT)



keyRelease(KeyEvent.SHIFT)


 */