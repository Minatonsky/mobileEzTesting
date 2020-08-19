package views;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class SignUpView extends ParentView {
    public SignUpView(AppiumDriver<WebElement> driver, String driverName) {
        super(driver, driverName);
    }

    private String signUpButton(String driverName){
        if (driverName.equals("ios")){
            return "//XCUIElementTypeNavigationBar[@name=\"Register\"]/XCUIElementTypeButton[2]";
        } else {
            return "//*[@text='Log in']";
        }
    }

    private String selectUserTypeButton() {
        return "//XCUIElementTypeButton[@name=\"Select User Type\"]";
    }

    private String driverTypeButton() {
        return "//XCUIElementTypeButton[@name=\"Professional Driver\"]";
    }

    private String firstNameField() {
        return "//XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField[1]";
    }

    private String lastNameField() {
        return "//XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField[2]";
    }

    private String phoneField() {
        return "//XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField[3]";
    }

    private String emailField() {
        return "//XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
    }

    private String passField() {
        return "//XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]";
    }

    private String passConfField() {
        return "/XCUIElementTypeApplication[@name=\"Ezlogz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[2]";
    }

    private String acceptButton() {
        return "//XCUIElementTypeOther[@name=\"I accept \"]";
    }

    public void enterPassConf(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(passConfField()), text);
    }

    public void enterPass(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(passField()), text);
    }

    public void enterEmail(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(emailField()), text);
    }

    public void enterPhone(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(phoneField()), text);
    }

    public void enterLastName(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(lastNameField()), text);
    }

    public void enterFirstName(String text) {
        actionsWithOurElements.enterTextOnElement(driver.findElementByXPath(firstNameField()), text);
    }

    public void clickOnUserTypeButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath(selectUserTypeButton()));
    }

    public void clickOnDriverTypeButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath(driverTypeButton()));
    }

    public void clickOnSignUpButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath(signUpButton(driverName)));
    }

    public void clickOnAcceptButton() {
        actionsWithOurElements.clickOnElement(driver.findElementByXPath(acceptButton()));
    }

}
