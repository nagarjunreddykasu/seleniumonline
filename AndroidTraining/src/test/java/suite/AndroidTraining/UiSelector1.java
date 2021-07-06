package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiSelector1 {
	
	@Test
	public void UiSelector() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")")).click();
		
		/*driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Dialogs\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textStartsWith(\"Alert\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\".*Dialogs\")")).click();*/
		
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Alert Dialogs\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"a message\")")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\".*a message\")")).click();
		
	}

}

/*
text() -> exact text attribute value
textContains() -> pass partial text attribute value
testStartsWith() -> pass some partial starting text attribute value
textMatches() -> pass regular expression (.*MESSAGE)


description() -> pass exact content-desc attribute value
descriptionContains() -> pass partial content-desc attribute value
descriptionStartsWith() ->  pass some partial starting content-desc attribute value
descriptionMatches()  -> pass regular expression (.*MESSAGE) with content-desc attribute value


resourceId()  pass exact resource-Id attribute value
resourceIdMatches() 

Android _ Emulator
IOS - Simulator  (xcode)


*/