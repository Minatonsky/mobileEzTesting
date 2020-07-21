package parentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import views.LoginView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static libs.Utils.waitABit;

public class ParentTest {
// SETTINGS FOR ANDROID
    String deviceName = "emulator-5554";
// SET DRIVER
    String driverName = "android";


//    protected AppiumDriver driver = null;
//    AndroidDriver<AndroidElement> androidDriver = (AndroidDriver) driver;
//    IOSDriver iosDriver = (IOSDriver) driver;


    Logger logger = Logger.getLogger(getClass());
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    AndroidDriver<AndroidElement> driver;
    protected LoginView loginView;



    @Before
    public void setUp() throws IOException{
        initDriver(driverName);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginView = new LoginView(driver);



    }
    private void initDriver(String driverName) throws IOException {
        if (driverName.equals("android")) {
            logger.info("Android will be started");
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            logger.info("deviceName " + deviceName);
            dc.setCapability("platformName", "android");
            dc.setCapability("appPackage", "com.ezlogz.ezlogz");
            dc.setCapability("appActivity", ".application.activities.LoginActivity");
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        } else if(driverName.equals("ios")){
            logger.info("IOS will be started");
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "../apps");
            File app = new File(appDir.getCanonicalPath(), "TestApp.app.zip");
            String deviceName = System.getenv("IOS_DEVICE_NAME");
            String platformVersion = System.getenv("IOS_PLATFORM_VERSION");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceName == null ? "iPhone 6s" : deviceName);
            capabilities.setCapability("platformVersion", platformVersion == null ? "11.1" : platformVersion);
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("automationName", "XCUITest");
//            driver = new IOSDriver<WebElement>(new URL(), capabilities);

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
