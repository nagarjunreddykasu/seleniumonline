package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HorizontalScroll {
	
	@Test
	public void horizontalScroll() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Tabs\"))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Scrollable\")")).click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollIntoView(new UiSelector().text(\"TAB 20\"))")).click();
		String content = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\".*tag Tab 20\")")).getText();
		System.out.println(content);
	}

}
