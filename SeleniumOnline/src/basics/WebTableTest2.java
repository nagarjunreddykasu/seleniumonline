package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableTest2 {
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
		driver.findElement(By.linkText("Approve Bills")).click();

		int colCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th")).size();
		System.out.println("Column Count: "+colCount);

		int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
		System.out.println("Row Count: "+rowCount);
		
		for(int row=1;row<=rowCount;row++){
			for(int col=1;col<colCount;col++){
				String data=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
