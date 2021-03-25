package basics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableTest {
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
		System.out.println("Column Count:"+colCount);
		for(int i=1;i<colCount;i++){
			String columnName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th["+i+"]")).getText();
			System.out.println(columnName);
		}

		int rowCount=driver.findElements(By.xpath("//table[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
		System.out.println("Row Count: "+rowCount);

		//TO get all grid data row wise
		for(int row=1;row<=rowCount;row++){
			for(int col=1;col<colCount;col++){
				String text=driver.findElement(By.xpath("//table[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td["+col+"]")).getText();
				//System.out.println("Row:"+row+" Col:"+col+"="+text);
				System.out.print(text+"\t");
			}
			System.out.println();
		}

		//To get Vendor Name column data
		System.out.println("*** Vendor Name column data ***");
		for(int row=1;row<=rowCount;row++){
			String vendorName=driver.findElement(By.xpath("//table[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]")).getText();
			System.out.println(vendorName);
		}

		WebElement txtVendorname=	driver.findElement(By.id("cpBody_ddlVendor_txt_comb"));
		txtVendorname.sendKeys("Cal Telephone");
		txtVendorname.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		int rowCountVendor=driver.findElements(By.xpath("//table[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
		System.out.println("Row Count: "+rowCountVendor);
		//To get Vendor Name column data after search
		System.out.println("*** Vendor Name column data after searching with Vendor Name ***");
		ArrayList<String> unmatched=new ArrayList<>();
		for(int row=1;row<=rowCountVendor;row++){
			String vendorName=driver.findElement(By.xpath("//table[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]")).getText();
			System.out.println(vendorName);
			if(!vendorName.equals("Cal Telephone")){
				unmatched.add(vendorName);
			}
		}
		if(unmatched.size()>0){
			throw new Exception("Actual Vendor name is not matched with the Expected Vendor name: "+unmatched);
		}
		else{
			System.out.println("All the records are displayed based on given Vendor name");
		}

	}

}
