package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		System.out.println(driver.findElement(By.id("TxtEmail")).getTagName()); //input
		
		System.out.println(driver.findElement(By.id("BtnLogin")).getTagName());//a
		
		System.out.println(driver.findElement(By.id("TxtEmail")).getAttribute("class"));
		
		Dimension d=driver.findElement(By.id("TxtEmail")).getSize();
		
		System.out.println(d.height+"\t"+d.width);
		
		Point p=driver.findElement(By.id("TxtEmail")).getLocation();
		System.out.println(p.x+"\t"+p.y);
		
		
	}

}
