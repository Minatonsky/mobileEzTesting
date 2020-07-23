package views;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;


public class LoginView extends ParentView{


    private String LoginButton;
    Logger logger = Logger.getLogger(getClass());

    public LoginView(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    String driverName = "ios";


    public String loginButton(String driverName){
        if (driverName.equals("ios")){
            return LoginButton = "//XCUIElementTypeStaticText[@name='Log in']";
        } else{
            return LoginButton = "//*[@text='Log in']";
        }
    }

//    String LoginButton = "//XCUIElementTypeStaticText[@name='Log in']";


    public void closeUpdatePopUp() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='CLOSE']"));

    }

    public void clickOnLoginButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath(loginButton(driverName)));
    }

    public void enterLogin(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//XCUIElementTypeCell[8]"), text);
    }

    public void enterPass(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//XCUIElementTypeCell[10]"), text);
    }

    public void clickOnSubmitLoginButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Log in']"));
    }

    public void clickOnAccessLocationPopUp() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='While using the app']"));
    }

    public void clickOnDenyContactPopUp() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Deny']"));
    }

    public void clickOnDenyPhotoPopUp() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Deny']"));
    }
    public boolean isMainViewDisplayed(){return actionsWithOurElements.isElementEnable(driver.findElementByXPath("//*[@text='Logbook']"));}


}