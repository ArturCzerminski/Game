package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefsAgreements {

    public AppiumDriver driver;

    @Given("^I open the app$")
    public void iOpenTheApp() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();
        Capabilities.setCapability("deviceName", "FFY5T18119004557");
        Capabilities.setCapability("platformName", "Android");
        Capabilities.setCapability("app", "C:\\Users\\a.czerminski\\Desktop\\app\\Sudoku com_v1.3.8_apkpure.com.apk");
        Capabilities.setCapability("autoGrantPermissions", "true");
        Capabilities.setCapability("unicodeKeyboard", "true");
        Capabilities.setCapability("resetKeyboard", "true");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        throw new PendingException();
    }

    @When("^I tap on the accept button on the private policy pop up$")
    public void iTapOnTheAcceptButtonOnThePrivatePolicyPopUp() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/btnAccept")).click();

        throw new PendingException();
    }

    @When("^I tap on the accept button on the advertisement pop up$")
    public void iTapOnTheAcceptButtonOnTheAdvertisementPopUp() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/btnAccept")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        throw new PendingException();
    }


    @Then("^I see that a tutorial screen is displayed$")
    public void iSeeThatATutorialScreenIsDisplayed() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).isDisplayed()) {

            System.out.println("How to play text is visible");
        }
        else System.out.println("How to play text is not visible");

        throw new PendingException();
    }
}
