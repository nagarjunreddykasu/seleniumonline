package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		///driver.findElement(By.id("TxtEmail"));
		
		//By.name("TxtEmail")
		//By.className("form-control")
		
		//By.cssSelector("#TxtEmail")
		//By.xpath("//*[@id='TxtEmail']")
		
		//By.tagName("input");
		
		//By.linkText("Forgot Password?");   //*[@id="ahrefFPWD"]  #ahrefFPWD

		//By.partialLinkText("Forgot");
		
		//custom xpath syntax:
		//1. //tagname[@attributename='value']  //input[@name='TxtEmail']
		
		//name="usernameTxtEmailjshdfkjshfkjshfkj hskjf kjhfkjdhsfkjs hdkfj"
		//2. //tagname[starts-with(@attribute,'partialstartingvalue')]
		//ex: //input[starts-with(@name,'username')]
		
		//3. //tagname[contains(@attribute,'value')]
		//ex: //input[contains(@name,'hskjf')]
		
		
		//custom cssSelectors:
		//1. tagname[attributename='value']   ex: input[name='TxtEmail']
		//By.cssSelector("input[name='TxtEmail']");
		
		//2. tagname#idvalue  ex: input#TxtEmail
		
		//3. tagname.classvalue ex: input.form-control
		
		//4. #idvalue ex: #TxtEmail
		//5. .classvalue ex: .form-control
		
		
		
	}

}


/*
Locators:

id
name
cssSelector
xpath
className
tagName
linkText
partialLinkText



*/