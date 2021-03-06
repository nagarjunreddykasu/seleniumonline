package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@1234");
		driver.findElement(By.id("BtnLogin")).click();
		
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		driver.findElement(By.id("cpBody_ddlAutoCompExt_txt_comb")).sendKeys("Ca");
		
		Reusable.wait(driver, By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		
		
		System.out.println(list.size());
		
		String expected="National Eye Care";
		for(int i=0;i<list.size();i++){
			String actual=list.get(i).getText();
			if(expected.equals(actual)){
				list.get(i).click();
				break;
			}
		}
		
	}

}
