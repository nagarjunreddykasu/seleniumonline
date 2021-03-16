package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement jobtitle=driver.findElement(By.id("ddlJobTitle"));
		
		Select sel=new Select(jobtitle);
		sel.selectByVisibleText("President");
		//sel.selectByValue("8");
		//sel.selectByIndex(5);
		
		WebElement selectedValue=sel.getFirstSelectedOption();
		System.out.println("Selected Value is: "+selectedValue.getText());
		
		
		//selectByVisibleText("")
		//selectByValue("")
		//selectByIndex()
		
	}

}
