package suite.AndroidTraining;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Reusable {
	public static AndroidDriver<AndroidElement> launchApp() throws MalformedURLException{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//cap.setCapability(MobileCapabilityType.UDID, "");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		/*File app=new File(System.getProperty("user.dir")+"//ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());*/
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
