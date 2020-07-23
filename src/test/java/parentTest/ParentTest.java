package parentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import views.LoginView;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static libs.Utils.waitABit;

public class ParentTest {

    AppiumDriver driver;

    protected LoginView loginView;
    Logger logger = Logger.getLogger(getClass());
    String driverName = "ios";


    @Before
    public void setUp() throws IOException {
        initDriver(driverName);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginView = new LoginView(driver);

    }
    private void initDriver(String driverName) throws IOException {
        if (driverName.equals("android")) {
            logger.info("Android will be started");
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            dc.setCapability("platformName", "android");
            dc.setCapability("appPackage", "com.ezlogz.ezlogz");
            dc.setCapability("appActivity", ".application.activities.LoginActivity");
            dc.setCapability("NoReset", true);
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        } else if(driverName.equals("ios")){
            logger.info("IOS will be started");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("platformVersion", "13.6");
            capabilities.setCapability("deviceName", "iPhone 8");
            capabilities.setCapability("NoReset", true);
            capabilities.setCapability("app", "Users/liuda/Library/Developer/Xcode/DerivedData/Ezlogz-epoddvtzccjrrzcoggrteqmmhslr/Build/Products/Debug-iphonesimulator/Ezlogz.app");
            driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } else {
            logger.error("Can`t init driver");
            Assert.fail("Can`t init driver");}
    }

    @After
    public void tearDown() {
        driver.quit();
        logger.info("Driver is close");
    }

    protected void checkAC(String message, boolean actual, boolean expected){
        waitABit(1);
        if (actual != expected){
            logger.error("AC failed: " + message);
        }
        Assert.assertEquals(message,expected,actual);
        logger.info("AC passed");
    }

}
