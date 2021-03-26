package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebTableTest3 {
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

		new Select(driver.findElement(By.id("cpBody_GVBillReviewApprove_lbDynamicPager"))).selectByVisibleText("25");

		int pageCount=driver.findElements(By.xpath("//ul[contains(@class,'pagination')]/li")).size();
		System.out.println("Page Count: "+pageCount);

		int actualPages=pageCount-4;
		System.out.println("Actual Page Count: "+actualPages);
		int totalRecords=0;
		if(pageCount>0){
			for(int i=1;i<=actualPages;i++){
				if(i!=1){
					driver.findElement(By.xpath("//ul[contains(@class,'pagination')]/li["+(2+i)+"]/a")).click();
					Thread.sleep(5000);
				}
				int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
				System.out.println("Row Count in page-"+i+": "+rowCount);
				
				totalRecords=totalRecords+rowCount;

				//To get Vendor column data
				for(int row=1;row<=rowCount;row++){
					WebElement vendor=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]"));
					Reusable.scroll(driver, vendor);
					String vendorName=vendor.getText();
					System.out.println(vendorName);
				}
			}
			System.out.println("Total Records from all the pages: "+totalRecords);
		}
		else{
			int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
			System.out.println("Row Count: "+rowCount);
			//To get Vendor column data
			for(int row=1;row<=rowCount;row++){
				WebElement vendor=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]"));
				Reusable.scroll(driver, vendor);
				String vendorName=vendor.getText();
				System.out.println(vendorName);
			}
		}
		
	}

}
