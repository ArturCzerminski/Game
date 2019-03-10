package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefsBackgroundColor {
    @Given("^I am on the game view$")
    public void iAmOnTheGameView() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();
        Capabilities.setCapability("deviceName", "FFY5T18119004557");
        Capabilities.setCapability("platformName", "Android");
        Capabilities.setCapability("app", "C:\\Users\\a.czerminski\\Desktop\\app\\Sudoku com_v1.3.8_apkpure.com.apk");
        Capabilities.setCapability("autoGrantPermissions", "true");
        Capabilities.setCapability("unicodeKeyboard", "true");
        Capabilities.setCapability("resetKeyboard", "true");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/btnAccept")).click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/btnAccept")).click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/skip")).click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        throw new PendingException();
    }

    @When("^I tap on the color pallete icon$")
    public void iTapOnTheColorPalleteIcon() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.findElement(By.id("easybrain.sudoku.android:id/action_theme")).click();

        driver.findElement(By.id("com.easybrain.sudoku.android:id/ok")).click();

        throw new PendingException();
    }

    @And("^I tap on black picker$")
    public void iTapOnBlackPicker() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/theme_dark")).click();

        throw new PendingException();
    }

    @And("^I tap on the ok button$")
    public void iTapOnTheOkButton() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        driver.findElement(By.id("com.easybrain.sudoku.android:id/ok")).click();

        throw new PendingException();
    }

    @Then("^I see that background color of the app is changed to black$")
    public void iSeeThatBackgroundColorOfTheAppIsChangedToBlack() throws Throwable {

        DesiredCapabilities Capabilities = new DesiredCapabilities();

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);

        if (driver.findElement(By.id("com.easybrain.sudoku.android:id/theme_dark")).isDisplayed()) {

            System.out.println("Correct color theme is displayed");
        }
        throw new PendingException();
    }
}
