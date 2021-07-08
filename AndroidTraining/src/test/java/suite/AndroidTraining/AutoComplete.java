package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AutoComplete {
	
	@Test
	public void autoComplete() throws InterruptedException, MalformedURLException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Auto Complete']")).click();
		driver.findElement(MobileBy.AccessibilityId("1. Screen Top")).click();

		driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("United");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}
