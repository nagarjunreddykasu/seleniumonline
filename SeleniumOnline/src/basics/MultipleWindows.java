package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		
		Reusable.wait(driver, By.xpath("//ul[@class='bannerList ']/li[1]"));
		driver.findElement(By.xpath("//ul[@class='bannerList ']/li[1]")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		String child=null;
		while(itr.hasNext()){
			child=itr.next();
			if(!parent.equals(child)){
				driver.switchTo().window(child);
				break;
			}
		}
		System.out.println("Child window title: "+driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		driver.switchTo().window(parent);
		System.out.println("Main window title: "+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(child);
		System.out.println("Child window title: "+driver.getTitle());
		//driver.quit();


		
	}

}
