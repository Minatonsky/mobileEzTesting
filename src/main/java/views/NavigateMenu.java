package views;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class NavigateMenu extends ParentView{
    public NavigateMenu(AppiumDriver<WebElement> driver, String driverName) {
        super(driver, driverName);
    }
    public void clickOnNavigateMenu(){
        if (driverName.equals("ios")){
            actionsWithOurElements.clickOnElement(driver.findElementByXPath(""));
        } else{
            actionsWithOurElements.clickOnElement(driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200F\u200F\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200E\u200F\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200F\u200E\u200F\u200F\u200E\u200E\u200F\u200E\u200F\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200ENavigate up\u200E\u200F\u200E\u200E\u200F\u200E\"]\n"));
        }
    }
    public void clickOnLogout(){
        if (driverName.equals("ios")){
            actionsWithOurElements.clickOnElement(driver.findElementByXPath(""));
        } else{
            actionsWithOurElements.clickOnElement(driver.findElementByXPath("//*[@text='Logout']"));
        }
    }
    public void doLogout(){
        clickOnNavigateMenu();
        clickOnLogout();
    }
}
