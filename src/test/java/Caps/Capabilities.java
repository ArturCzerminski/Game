package Caps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {

    public static DesiredCapabilities getDesiredCapabilities() throws MalformedURLException {

        DesiredCapabilities Capabilities = new DesiredCapabilities();
        Capabilities.setCapability("deviceName", "FFY5T18119004557");
        Capabilities.setCapability("platformName", "Android");
        Capabilities.setCapability("app", "C:\\Users\\a.czerminski\\Desktop\\app\\Sudoku com_v1.3.8_apkpure.com.apk");
        Capabilities.setCapability("autoGrantPermissions", "true");
        Capabilities.setCapability("unicodeKeyboard", "true");
        Capabilities.setCapability("resetKeyboard", "true");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        return Capabilities;
    }
}
