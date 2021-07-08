package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventsTest {
	
	@Test
	public void keyEvents() throws InterruptedException, MalformedURLException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='App']")).click();
		
		//below two are deprecated in latest version
		/*driver.sendKeyEvent(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);*/

		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		// driver.pressKey(new KeyEvent(AndroidKey.HOME));

		// driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));

		/*driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.CAPS_LOCK));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_LEFT));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new KeyEvent(AndroidKey.TAB));
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_IN));
		driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_OUT));*/
	}

}
