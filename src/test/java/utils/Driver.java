package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private Driver(){

    }

    private static AndroidDriver driver;

    private static final String platformName = ConfigReader.getProperty("platformName");
    private static final String platformVersion = ConfigReader.getProperty("platformVersion");
    private static final String deviceName = ConfigReader.getProperty("deviceName");
    private static final String app = ConfigReader.getProperty("app");
    private static final String appPackage = ConfigReader.getProperty("appPackage");
    private static final String appActivity = ConfigReader.getProperty("appActivity");

    public static AndroidDriver getDriver() {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(platformName);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformVersion(platformVersion);
        options.setDeviceName(deviceName);
        options.setApp(System.getProperty("user.dir") + app);
        options.noReset();


        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}
