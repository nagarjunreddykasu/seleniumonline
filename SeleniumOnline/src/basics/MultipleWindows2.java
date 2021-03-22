package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows2 {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='root']/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while(itr.hasNext()){
			String childId=itr.next();
			if(!parentId.equals(childId)){
				driver.switchTo().window(childId);
				break;
			}
		}
		
		String childWindowTitle=driver.getTitle();
		System.out.println("Child window title: "+childWindowTitle);
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		String parentWindowTitle=driver.getTitle();
		System.out.println("Parent window title: "+parentWindowTitle);
	}

}
