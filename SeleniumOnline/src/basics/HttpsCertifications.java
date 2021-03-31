package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HttpsCertifications {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://129.213.162.67:9074/clientportal/ajguat");
		
		
		
	}

}
