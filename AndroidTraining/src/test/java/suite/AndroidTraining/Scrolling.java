package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling {
	
	@Test
	public void scrolling() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Popup Menu\"))")).click();
		
		/*
		new UiScrollable(new UiSelector().resourceId(\"android:id/list"\)).scrollIntoView(new UiSelector().text(\"Popup Menu"\)).click();
		
		setAsVerticalList()
		setAsHorizontalList()
		
		
		 */
		
		
		
		
	}

}
