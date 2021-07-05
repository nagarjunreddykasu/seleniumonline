package suite.AndroidTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class APIDemo {
	
	@Test
	public void lauchApp() throws MalformedURLException, InterruptedException{
		
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
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Alert Dialogs").click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/two_buttons")).click();
		Thread.sleep(2000);
		String actualAlertMessage=driver.findElement(By.id("android:id/alertTitle")).getText();
		
		//driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Lorem ipsum')]")).getText();
		System.out.println(actualAlertMessage);
		
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		
		
		
	}

}


/*

platformname -> Android
devicename -> "emulator-5554"  or "Nexus_5_API_29" or "Android Emulator"
Automationname -> UiAutomator2
app -> apk info (path of apk file)

Command to get package and activity name
adb shell
dumpsys window windows | grep -E 'mObscuringWindow'

app package -> io.appium.android.apis
app activity -> io.appium.android.apis.ApiDemos

apk analyzer app 

No_reset -> true
Full_Reset -> false

Real device:
-------------
enable usb debugging in developer tools


adb devices

----------------------------------------
id name className xpath cssSelector linkText partialLinkText tagName


Android:
id className xpath
AccessibilityId
AndroidUIAutomator


resource-id  -> id
class -> className
content-desc -> AccessibilityId
text -> xpath

//tagname(@attributename='value')
 *tagname[starts-with(@attributename,'partialstartingvalue')]
 *tagname[contains(@attributename,'partialvalue')]
 */