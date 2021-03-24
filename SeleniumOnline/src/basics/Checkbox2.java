package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Count of Checkboxes: "+checkboxes.size());
		
		for(int i=1;i<checkboxes.size();i++){
			if(i==3){
				String labelMsg=driver.findElement(By.xpath("//div[@id='discount-checkbox']/div["+i+"]/div/label")).getText();
				System.out.println(labelMsg);
			}
			else{
				String labelMsg=driver.findElement(By.xpath("//div[@id='discount-checkbox']/div["+i+"]/label")).getText();
				System.out.println(labelMsg);
			}
			
		}
		
	}

}
