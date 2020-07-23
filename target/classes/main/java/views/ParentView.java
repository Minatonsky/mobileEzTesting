package views;

import io.appium.java_client.AppiumDriver;
import libs.ActionsWithOurElements;
import org.openqa.selenium.WebElement;


public class ParentView {

    AppiumDriver driver;
    String driverName;
    ActionsWithOurElements actionsWithOurElements;

    public ParentView(AppiumDriver<WebElement> driver, String driverName) {
        this.driver = driver;
        this.driverName = driverName;
        actionsWithOurElements = new ActionsWithOurElements(driver);
    }
}
