package basics;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
	public static void main(String[] args) throws Exception {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");
		
		boolean bl=driver.findElement(By.id("BtnLogin")).isDisplayed();
		System.out.println(bl);
		//isDisplayed()
		
		WebElement username=driver.findElement(By.id("TxtEmail"));
		WebElement password=driver.findElement(By.id("TxtPassword"));
		WebElement forgot=driver.findElement(By.linkText("Forgot Password?"));
		WebElement signin=driver.findElement(By.id("BtnLogin"));
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		
		
		ArrayList<WebElement> al=new ArrayList<>();
		al.add(username);
		al.add(password);
		al.add(forgot);
		al.add(signin);
		al.add(signup);
		
		ArrayList<WebElement> undisplayed=new ArrayList<>();
		Iterator<WebElement> itr=al.iterator();
		while(itr.hasNext()){
			WebElement element=itr.next();
			if(element.isDisplayed()){
				System.out.println(element+" is displayed.");
			}
			else{
				undisplayed.add(element);
				System.out.println(element+" is not displayed.");
			}
		}
		
		System.out.println("Undisplayed elements are: "+undisplayed);
		if(undisplayed.size()>0){
			throw new Exception("There are undisplayed elements."+ undisplayed);
		}
		
		
		
	}

}
