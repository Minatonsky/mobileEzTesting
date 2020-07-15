package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class LoginView extends ParentView{


    public LoginView(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    public void closeUpdatePopUp() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='CLOSE']"));

    }

    public void clickOnLoginButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Log in']"));
    }

    public void enterLogin(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//*[@text='Email']"), text);
    }

    public void enterPass(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath("//*[@text='Password']"), text);
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