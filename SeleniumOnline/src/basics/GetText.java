package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws Exception {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		driver.findElement(By.id("BtnLogin")).click();
		
		String msgUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
		System.out.println(msgUserName);
		
		
		String expectedUserName="Please enter Username / Email Address";
		
		if(expectedUserName.equals(msgUserName)){
			System.out.println("Both Actual and Expected validation messages are equal.");
		}
		else{
			System.out.println("Both Actual and Expected validation messages are NOT equal.");
			throw new Exception("Both Actual and Expected validation messages are NOT equal."+msgUserName);
		}
		
		
		String msgPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
		System.out.println(msgPassword);
		
		//*[@id="Div1"]/div[2]/div
		//*[@id="Div1"]/div[4]/div
	}

}
