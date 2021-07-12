package suite.AndroidTraining;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class SwipeTest {
	
	@Test
	public void swipe() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		Thread.sleep(2000);
		TouchAction touch=new TouchAction(driver);
		AndroidElement views=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")"));
		touch.tap(tapOptions().withElement(element(views))).perform();
		Thread.sleep(1000);
		AndroidElement date=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Date Widgets\")"));
		touch.tap(tapOptions().withElement(element(date))).perform();
		Thread.sleep(2000);
		AndroidElement inline=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Inline\")"));
		touch.tap(tapOptions().withElement(element(inline))).perform();
		
		Thread.sleep(2000);
		AndroidElement hour=driver.findElement(MobileBy.AccessibilityId("8"));
		touch.tap(tapOptions().withElement(element(hour))).perform();
		
		AndroidElement source=driver.findElement(MobileBy.AccessibilityId("15"));
		
		AndroidElement dest=driver.findElement(MobileBy.AccessibilityId("45"));
		Thread.sleep(2000);
		touch.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(dest)).release().perform();
		
		
		
	}

}
