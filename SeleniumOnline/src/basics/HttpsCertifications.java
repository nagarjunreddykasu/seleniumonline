package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpsCertifications {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		
		/*DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setAcceptInsecureCerts(true);  //OR
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		/*ChromeOptions options=new ChromeOptions();
		//options.merge(cap);
		//options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);*/
		
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();

		driver.get("https://129.213.162.67:9074/clientportal/ajguat");
	}

}
