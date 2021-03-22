package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComboBoxValues {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("URL");
		driver.findElement(By.id("TxtEmail")).sendKeys("email");
		driver.findElement(By.id("TxtPassword")).sendKeys("password");
		driver.findElement(By.id("BtnLogin")).click();

		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();

		Reusable.click(driver, By.id("cpBody_ddlAutoCompExt_btn_comb"));
		Reusable.wait(driver, By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']"));

		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			String actual=list.get(i).getText();
			System.out.println(actual);
		}

	}

}
