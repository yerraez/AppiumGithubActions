package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests {
    public static AppiumDriver driver;

    public static void Android_setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/todov.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    //59017C6F-D964-4C96-9F15-CB0BD9C559A7 iphone 12
    //874A00E6-047D-4AF7-A778-0941CC877BD7 iphone 12 mini
    public static void iOS_setUp(String port, String deviceName,String platformVersion, String udid, String wdaLocalPort ) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/todoList-iOS-master.zip");
        caps.setCapability("wdaLocalPort", wdaLocalPort);
        caps.setCapability("udid", udid);
        driver = new IOSDriver(new URL("http://localhost:"+port+"/wd/hub"), caps);
    }

    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
