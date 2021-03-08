package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp {
	
	public static void main(String[] args) {
		
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//TO Launch the URL
		driver.get("http://google.com");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		
		
		
		
		
	}

}
