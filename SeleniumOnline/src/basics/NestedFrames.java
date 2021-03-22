package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");


		int count=driver.findElements(By.tagName("frame")).size();

		System.out.println("Count of frames: "+count);
		
		driver.switchTo().frame("frame-top");
		
		int innerFramesCount=driver.findElements(By.tagName("frame")).size();

		System.out.println("Count of inner frames: "+innerFramesCount);
		
		driver.switchTo().frame("frame-left");
		String leftFrame=driver.findElement(By.tagName("body")).getText();
		System.out.println("Left frame Text: "+leftFrame);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		String middleFrame=driver.findElement(By.tagName("body")).getText();
		System.out.println("Middle frame Text: "+middleFrame);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		String rightFrame=driver.findElement(By.tagName("body")).getText();
		System.out.println("Right frame Text: "+rightFrame);
		
		driver.switchTo().defaultContent();
		
		
	}

}
