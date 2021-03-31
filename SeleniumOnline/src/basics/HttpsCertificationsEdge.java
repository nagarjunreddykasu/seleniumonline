package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HttpsCertificationsEdge {
	public static void main(String[] args) {
		EdgeOptions options=new EdgeOptions();
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://129.213.162.67:9074/clientportal/ajguat");
		
		
	}

}
