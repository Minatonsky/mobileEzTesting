package libs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;



public class ActionsWithOurElements {
    AndroidDriver<AndroidElement> driver;
    Actions action;
    Logger logger = Logger.getLogger(getClass());


    public ActionsWithOurElements(AndroidDriver<AndroidElement> driver) {

        this.driver = driver;
        action = new Actions(driver);
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element " + e);
        Assert.fail("Cannot work with element " + e);
    }

    public void clickOnElement(AndroidElement androidElement){
        try{
            androidElement.click();
            logger.info("Element " + androidElement + " was clicked");
        } catch(Exception e){
            printErrorAndStopTest(e);
        }
    }

    public void enterTextOnElement(AndroidElement androidElement, String text){
        try{
            androidElement.sendKeys(text);
            logger.info("Text " + text + " " + androidElement + " was entered");
        } catch(Exception e){
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementEnable(AndroidElement androidElement){
        try{
            androidElement.isEnabled();
            logger.info("Element " + androidElement + " is enable");
            return androidElement.isEnabled();
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
