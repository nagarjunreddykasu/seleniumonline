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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import datadriven.ExcelReader;

public class Reusable {
public static WebDriver driver;
	
	public static void launchApp(String browser, String url){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//drivers//IEDriverServer.exe");
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability("ignoreProtectedModeSettings", true);
			options.setCapability("disable-popup-blocking", true);
			options.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(options);
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void sendKeys(WebDriver driver,By locator,String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void click(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	
	public static void clear(WebDriver driver,By locator){
		driver.findElement(locator).clear();
	}
	
	public static String getText(WebDriver driver, By locator){
		return driver.findElement(locator).getText();
	}
	public static String takeScreenshot(WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"//screenshots//screenshot.png";
		File destination=new File(dest);
		FileUtils.copyFile(source,destination);
		return dest;
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
	
	public static String getMethodName() {
		return new Exception().getStackTrace()[1].getMethodName();
	}
	
	public static boolean isSkip(ExcelReader excel, String sheetName, String testcaseID) {
		boolean isSkip = false;
		int rowNumber = excel.getFirstDataRowNum(sheetName, "TCID", testcaseID);
		String runMode = excel.getCellData(sheetName, "Run", rowNumber);
		if (runMode.contentEquals("No") || runMode.isEmpty()) {
			isSkip = true;
		} else {
			isSkip = false;
		}
		return isSkip;
	}
	
	public static void setResultInExcel(ExcelReader excel, String sheetName, String testcaseID, String result)throws IOException {
		excel.setCellData(sheetName, testcaseID, "Result", result);
	}

}
