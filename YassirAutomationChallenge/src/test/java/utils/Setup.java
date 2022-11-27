package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.P01_MoviesList;
import pages.P02_MovieDetails;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {


    // Static objects which will save a lot of memory

    public static AppiumDriver appiumDriver;
    public static P01_MoviesList moviesList;

    public static P02_MovieDetails movieDetails;
    public static AndroidTouchAction action;


    // Before test has to declare the initiation of each declared Static Objects
    @Before
    public static void setUp() throws MalformedURLException {

        // Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("noReset", "true");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Android");
        caps.setCapability("udid", "emulator-5554");
        //caps.setCapability("app", System.getProperty("user.dir")+"/apps/ApiDemos-debug.apk");
        caps.setCapability("appPackage", "com.skydoves.themovies");
        caps.setCapability("appActivity", "com.skydoves.themovies.view.ui.main.MainActivity");


        URL url = new URL("http://localhost:4723/wd/hub");
        appiumDriver = new AppiumDriver(url, caps);
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        moviesList = new P01_MoviesList();
        movieDetails = new P02_MovieDetails();

        action = new AndroidTouchAction(appiumDriver);
    }


    // After test has to be .quit not .close to terminate the driver completely

    @After
    public void tearDown() {
        if (null != appiumDriver) {
            appiumDriver.quit();
        }

    }
}
