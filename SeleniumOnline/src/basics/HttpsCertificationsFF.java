package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HttpsCertificationsFF {
	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		//options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://129.213.162.67:9074/clientportal/ajguat");
		
		
		
	}

}
