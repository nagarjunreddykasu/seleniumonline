package basics;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DownloadFileChrome2 {
	public static void main(String[] args) throws Exception {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		String downloadFilePath=System.getProperty("user.dir")+"\\downloads\\";
	
		HashMap<String,Object> chromePrefs=new HashMap<>();
		chromePrefs.put("download.default_directory", downloadFilePath);
		
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriver driver=new ChromeDriver(options);
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
		Thread.sleep(5000);
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
