package suite.AndroidTraining;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TextEntryDialog {
	
	@Test
	public void textEntry() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Alert Dialogs").click();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("Text Entry dialog")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("io.appium.android.apis:id/username_edit")).sendKeys("TestUser");
		
		driver.findElements(MobileBy.className("android.widget.EditText")).get(1).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		
		
		
	}
	

}

