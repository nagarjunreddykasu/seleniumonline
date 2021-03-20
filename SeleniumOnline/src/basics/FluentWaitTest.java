package basics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait (globally)
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/dynamic_loading");

		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		/*Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		w.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else
					return null;
			}
		});*/
		
		Reusable.flunetWait(driver, By.cssSelector("[id='finish'] h4"));
		
		Thread.sleep(5000);
		
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		
		
	}

}
