package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		//To Launch the Chrome browser
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		//To Launch Firefox browser, need to download geckodriver.exe
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		//To Launch IE browser, need to download IEDriverServer.exe
		/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		
		//To Launch Edge browser, need to download IEDriverServer.exe
		/*System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();*/
		
		//To Launch Opera browser, need to download operadriver.exe
		/*System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"//drivers//operadriver.exe");
		WebDriver driver=new OperaDriver();*/
		
		System.setProperty("webdriver.safari.driver", System.getProperty("user.dir")+"//drivers//safaridriver.exe");
		WebDriver driver=new SafariDriver();
		
		//TO Launch the URL
		driver.get("http://google.com");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		
		
		
	}

}
