package basics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableTest1 {
	public static void main(String[] args) throws Exception {
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


		ArrayList<String> actualColumns=new ArrayList<>();
		for(int i=1;i<colCount;i++){
			String columnName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th["+i+"]")).getText();
			actualColumns.add(columnName);
			//System.out.println(columnName);
		}
		System.out.println(actualColumns);

		int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();

		System.out.println("Row Count: "+rowCount);

		//To get Vendor column data
		for(int row=1;row<=rowCount;row++){
			String vendorName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]")).getText();
			System.out.println(vendorName);
		}

		WebElement vendor=driver.findElement(By.id("cpBody_ddlVendor_txt_comb"));
		vendor.sendKeys("Cal Telephone");
		vendor.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		int rowCountVendor=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();

		System.out.println("Row Count: "+rowCountVendor);

		//To get Vendor column data after searching with vendorname
		System.out.println("*** After searching with vendor name ***");
		ArrayList<String> unmatched=new ArrayList<>();
		for(int row=1;row<=rowCountVendor;row++){
			String vendorName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]")).getText();
			if(!vendorName.equals("Cal Telephone")){
				unmatched.add(vendorName);
			}
			
		}
		
		if(unmatched.size()>0){
			throw new Exception("Actual and Expected Vendor names are NOT matched with expected vendor name: "+unmatched);
		}
		else{
			System.out.println("Actual and Expected Vendor names are matched");
		}
		





	}

}


/*

<table>
<th>
<tr> and <td>



 */