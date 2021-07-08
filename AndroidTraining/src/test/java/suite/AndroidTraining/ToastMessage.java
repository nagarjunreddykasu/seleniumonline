package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ToastMessage {
	
	@Test
	public void toastMessage() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))")).click();
		Thread.sleep(3000);

		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/spinner1\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"blue\")")).click();
		String toastMessage = driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(toastMessage);

		Assert.assertEquals("Spinner1: position=4 id=4", toastMessage);
	}

}
