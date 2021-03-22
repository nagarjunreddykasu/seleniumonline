package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		String parentId=driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String>itr=handles.iterator();
		while(itr.hasNext()){
			String childId=itr.next();
			if(!parentId.equals(childId)){
				driver.switchTo().window(childId);
				break;
			}
		}
		
		String childText=driver.findElement(By.cssSelector(".example")).getText();
		System.out.println("Child window text: "+childText);
		Thread.sleep(2000);
		//driver.close();
		driver.switchTo().window(parentId);
		String parentText=driver.findElement(By.cssSelector(".example")).getText();
		System.out.println("Parent window text: "+parentText);
		//System.out.println(handles);
	}

}
