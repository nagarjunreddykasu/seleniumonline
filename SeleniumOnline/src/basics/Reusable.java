package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {
	
	
	public static void sendKeys(WebDriver driver,By locator,String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void click(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	
	public static String getText(WebDriver driver, By locator){
		return driver.findElement(locator).getText();
	}
	public static void takeScreenshot(WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"//screenshots//screenshot.png";
		File destination=new File(dest);
		FileUtils.copyFile(source,destination);
	}
	public static void uploadRobot(String filePath) throws AWTException{
		StringSelection sel=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);	
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void scroll(WebDriver driver, WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static ArrayList<WebElement> isDisplayed(ArrayList<WebElement> al){
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
		
		return undisplayed;
		
	}
	
	public static ArrayList<String> compareArrayLists(ArrayList<String> expected,ArrayList<String> actual){
		Iterator<String> itr=expected.iterator();
		while(itr.hasNext()){
			String value=itr.next();
			if(actual.remove(value)){
				itr.remove();
			}
		}
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(expected);
		unmatched.addAll(actual);
		return unmatched;
		
	}
	
	public static void wait(WebDriver driver,By locator){
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	public static void flunetWait(WebDriver driver,By locator){
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		w.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				if(driver.findElement(locator).isDisplayed()){
					return driver.findElement(locator);
				}
				else
					return null;
			}
		});
	}

}
