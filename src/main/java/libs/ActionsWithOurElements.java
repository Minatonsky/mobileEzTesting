package libs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ActionsWithOurElements {
    AppiumDriver<WebElement> driver;
    Actions action;
    Logger logger = Logger.getLogger(getClass());


    public ActionsWithOurElements(AppiumDriver<WebElement> driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element " + e);
        Assert.fail("Cannot work with element " + e);
    }

    public void clickOnElement (WebElement webElement){
        try{
            webElement.click();
            logger.info("Element " + webElement + " was clicked");
        } catch(Exception e){
            printErrorAndStopTest(e);
        }
    }

    public void enterTextOnElement(WebElement webElement, String text){
        try{
            webElement.sendKeys(text);
            logger.info("Text " + text + " " + webElement + " was entered");
        } catch(Exception e){
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementEnable(WebElement webElement){
        try{
            webElement.isEnabled();
            logger.info("Element " + webElement + " is enable");
            return webElement.isEnabled();
        } catch(Exception e){
            logger.info("Element is enabled - > false");
            printErrorAndStopTest(e);
            return false;
        }
    }
    public boolean clearElement(AndroidElement androidElement){
        try{
            androidElement.clear();
            logger.info("Element " + androidElement + " is cleared");
            return androidElement.isEnabled();
        } catch(Exception e){
            logger.info("Element is enabled - > false");
            printErrorAndStopTest(e);
            return false;
        }
    }
}
