package views;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;


public class LoginView extends ParentView{



    Logger logger = Logger.getLogger(getClass());

    public LoginView(AppiumDriver<WebElement> driver, String driverName) {
        super(driver, driverName);
    }


    public void clickOnLoginButton(){
        if (driverName.equals("ios")){
            actionsWithOurElements.clickOnElement(driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Log in']"));
        } else{
            actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Log in']"));
        }
    }

    public void enterLogin(String text){
        if (driverName.equals("ios")){
            actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//XCUIElementTypeCell[8]"), text);
        } else{
            actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//*[@text='Email']"), text);
        }
    }

    public void enterPass(String text){
        if (driverName.equals("ios")){
            actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//XCUIElementTypeCell[10]"), text);
        } else{
            actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//*[@text='Password']"), text);
        }
    }

    public void clickOnSubmitLoginButton() {
        if (driverName.equals("ios")) {
            actionsWithOurElements.clickOnElement(driver.findElementByXPath(""));
        } else {
            actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Log in']"));
        }
    }
    public void closeTeamDriverPopup(String teamDriverValue){
        if (teamDriverValue.equals("1")){
            if (driverName.equals("ios")) {
                actionsWithOurElements.clickOnElement(driver.findElementByXPath(""));
            } else {
                actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='CANCEL']"));
            }
        }

    }

    public boolean isMainViewDisplayed() {
        if (driverName.equals("ios")) {
            return actionsWithOurElements.isElementEnable(driver.findElementByXPath(""));
        } else {
            return actionsWithOurElements.isElementEnable(driver.findElementByXPath("//*[@text='Logbook']"));
        }
    }











}
