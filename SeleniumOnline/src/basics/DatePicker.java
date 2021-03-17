package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void selectDay(WebDriver driver,String mon,String day) throws InterruptedException{
		while(!driver.findElement(By.cssSelector("[class*='ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText().contains(mon)){   //!false=true !true=false
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			Thread.sleep(1000);
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector("[class*='ui-datepicker-group-last'] [data-handler='selectDay']"));
		for(int i=0;i<dates.size();i++){
			String date=dates.get(i).getText();
			if(date.equals(day)){
				dates.get(i).click();
				break;
			}
		}
	}
	
	
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
		Thread.sleep(2000);
		//driver.findElement(By.linkText("30")).click();
		//#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(5) > td:nth-child(3) > a
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[5]/td[3]/a
		
		//To select current month date
		//List<WebElement> dates=driver.findElements(By.cssSelector("[class*='ui-datepicker-group-first'] [data-handler='selectDay']"));
		
		
		/*String month=driver.findElement(By.cssSelector("[class*='ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText();
		System.out.println("month info: "+month); //April 2021
*/		
		/*while(!driver.findElement(By.cssSelector("[class*='ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText().contains("December")){   //!false=true !true=false
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			Thread.sleep(1000);
		}
		
		
		//To select next month day
		List<WebElement> dates=driver.findElements(By.cssSelector("[class*='ui-datepicker-group-last'] [data-handler='selectDay']"));
		for(int i=0;i<dates.size();i++){
			String date=dates.get(i).getText();
			if(date.equals("31")){
				dates.get(i).click();
				break;
			}
		}*/
		
		selectDay(driver,"November","25");
		
		
	}

}
