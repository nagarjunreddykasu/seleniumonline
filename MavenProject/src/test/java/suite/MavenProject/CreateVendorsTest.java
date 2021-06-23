package suite.MavenProject;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ExcelReader;
import base.Reusable;

public class CreateVendorsTest {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser", "url" })
	public void beforeClass(String browser, String url) throws IOException, SQLException{
		Reusable.launchApp(browser, url);
		driver=Reusable.getDriver();
	}
	@Test(priority=1)
	public void TC_Login() throws SQLException, InterruptedException{
		try{
			driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
			driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
			driver.findElement(By.id("BtnLogin")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='menu_aVendors']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("menu_aSearchVendor")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("cpBody_aAddVendor")).click();
		}
		catch(Exception e){
			throw e;
		}
		
	}
	@Test(priority=2,dataProvider="Vendors Object Iterator")
	public void TC_CreateVendor(Vendors v) throws InterruptedException{
		try{
			Thread.sleep(2000);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtVendorName")).sendKeys(v.vendorName);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtEmail")).sendKeys(v.email);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtStreet")).sendKeys(v.street);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtCity")).sendKeys(v.city);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtState")).sendKeys(v.state);
			driver.findElement(By.id("cpBody_userNewVendor_cVtxtZip")).sendKeys("75092");
			Thread.sleep(2000);
			driver.findElement(By.id("cpBody_userNewVendor_cVbtnSubmit")).click();
			Thread.sleep(1000);
			Assert.assertEquals("Vendor has been successfully created.", driver.findElement(By.id("cpBody_userNewVendor_cVmsgdiv")).getText());
			System.out.println(v.vendorName+" has been successfully created.");
		}
		catch(Exception e){
			throw e;
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

	
	@DataProvider(name = "Vendors Object Iterator")
	public Iterator<Vendors> getVendorData(Method method) throws IOException {
		List<Vendors> list = new ArrayList<Vendors>();
		ExcelReader xl = new ExcelReader(System.getProperty("user.dir") + "//src//test//java//testdata//CreateVendors.xlsx");
		list.addAll(xl.getVendorExcelData("Sheet1", "TCID", method.getName()));
		for(Vendors v:list)
			System.out.println(v.vendorName);
		return list.iterator();
	}

}
