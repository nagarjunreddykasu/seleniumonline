package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class DownloadFileFirefox2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		
		String downloadFilePath=System.getProperty("user.dir")+"\\downloads\\";
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", downloadFilePath);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		//https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);
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
		driver.findElement(By.id("cpBody_btnExcel")).click();
		Thread.sleep(8000);
		String fileName="ApproveBills.xlsx";
		
		File dir=new File(downloadFilePath);
		File[] files=dir.listFiles();
		
		boolean isDownloaded=false;
		
		for(int i=0;i<files.length;i++){
			if(files[i].getName().equals(fileName)){
				System.out.println(fileName+" is downloaded...");
				isDownloaded=true;
				break;
			}
		}
		
		if(isDownloaded){
			System.out.println("File is downlowaded");
		}
		else{
			System.out.println("File is NOT downloaded..");
			throw new Exception("File is NOT downloaded..");
		}
		
		
	}

}
