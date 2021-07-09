package suite.AndroidTraining;

import java.net.MalformedURLException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class TouchActionTest {
	
	@Test
	public void touchactions() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		
		Thread.sleep(2000);
		TouchAction touch=new TouchAction(driver);
		
		AndroidElement views=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")"));
		
		touch.tap(tapOptions().withElement(element(views))).perform();
		
		/*Point point=views.getLocation();
		touch.tap(point(point.x+2,point.y+1)).perform();*/
		
		Thread.sleep(2000);
		
		AndroidElement lists=driver.findElement(MobileBy.AccessibilityId("Expandable Lists"));
		touch.tap(tapOptions().withElement(element(lists))).perform();
		Thread.sleep(1000);
		AndroidElement custom=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Custom\")"));
		touch.tap(tapOptions().withElement(element(custom))).perform();
		Thread.sleep(2000);
		AndroidElement people=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"People\")"));
		touch.longPress(longPressOptions().withElement(element(people)).withDuration(ofSeconds(2))).release().perform();
		
		String actualTitle=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sample menu\")")).getText();
		System.out.println(actualTitle);
		
	}

}
