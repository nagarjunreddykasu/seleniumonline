package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		/*Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		sel.selectByVisibleText("Bengaluru (BLR)");*/
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		////*[@id="dropdownGroup1"]/div/ul[1]/li[12]/a
		////*[@id="dropdownGroup1"]/div/ul[1]/li[9]/a
		//tagname[@attribute='value']
		
		//a[@value='DEL']
		
		////*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[3]/td[4]/a
		
		//TO select Current date that is highlighted
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		/*WebElement passengers=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select sel=new Select(passengers);
		sel.selectByVisibleText("5");*/
		
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("5");
		
	}

}
