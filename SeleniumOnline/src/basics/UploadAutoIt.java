package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadAutoIt {


	public static void main(String[] args) throws InterruptedException, IOException {
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
		
		String filePath=System.getProperty("user.dir")+"\\upload\\upload.exe";
		
		Runtime.getRuntime().exec(filePath);
		
		Thread.sleep(5000);
		driver.findElement(By.id("cpBody_lblUploadText")).click();
		
		String msg=driver.findElement(By.id("cpBody_Sucmsg")).getText();
		System.out.println(msg);	
		
	}

}

/*
ControlFocus("title","text","contrlID")
ControlSetText("title","text","ControlID","filePath")
ControlClick("title","text","contrlID")
 */






















