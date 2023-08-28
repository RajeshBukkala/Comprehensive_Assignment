package Mobile.Testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumStart {
	@Test
	public void StartMobile() throws MalformedURLException{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("MobileBharat");
		options.setApp("C:\\Users\\Rajesh\\Downloads\\APKFiles\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
		
	}

}
