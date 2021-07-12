package suite.AndroidTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebViewTest {
	@Test
	public void webView() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//cap.setCapability(MobileCapabilityType.UDID, "");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		File app=new File(System.getProperty("user.dir")+"//General-Store.apk");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nagarjun");
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(10000);
		
		Set<String> contexts=driver.getContextHandles();
		for(String contxtName:contexts){
			System.out.println(contxtName);
		}
		
		//NATIVE_APP
		//WEBVIEW_com.androidsample.generalstore
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.context("NATIVE_APP");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Native View");
		
		
		
		//appium --allow-insecure chromedriver_autodownload
		
		
	}

}
