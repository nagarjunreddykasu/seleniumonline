package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("Page Title is "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		System.out.println(driver.getPageSource());
		
		//driver.close();
		
		//driver.quit();
		
		
	}

}
