package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		Select sel=new Select(driver.findElement(By.id("multiselect")));
		
		System.out.println(sel.isMultiple());
		
		sel.selectByVisibleText("Maruti Suzuki");
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Hyundai");
		
		//deselectByVisibleText("")
		//deselectByValue("")
		//deselectByIndex()
		
		Thread.sleep(3000);
		
		//System.out.println(sel.getFirstSelectedOption().getText());
		
		List<WebElement> selectedValues=sel.getAllSelectedOptions();
		
		ArrayList<String> actual=new ArrayList<>();
		//for each
		for(WebElement element:selectedValues){
			actual.add(element.getText());
		}
		
		System.out.println("Selected Values: "+actual);
		
		//sel.deselectAll();
		
		//sel.deselectByVisibleText("Audi");
		//sel.deselectByVisibleText("Hyundai");
		
		
		
		
		
	}

}
