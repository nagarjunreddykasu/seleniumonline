package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {

		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		boolean beforeSelect=driver.findElement(By.xpath("//*[@id='pnlregister']/div[4]/div/div/div/label/input")).isSelected();
		System.out.println("Before selecting check box: "+beforeSelect);
		
		driver.findElement(By.xpath("//*[@id='pnlregister']/div[4]/div/div/div/label/span")).click();
		
		boolean afterSelect=driver.findElement(By.xpath("//*[@id='pnlregister']/div[4]/div/div/div/label/input")).isSelected();
		System.out.println("After selecting check box: "+afterSelect);
		
		//*[@id="chkIsAccountingFirm"]

		

	}

}
