package views;

import io.appium.java_client.AppiumDriver;
import libs.ActionsWithOurElements;
import org.openqa.selenium.WebElement;


public class ParentView {

    AppiumDriver driver;
    ActionsWithOurElements actionsWithOurElements;

    public ParentView(AppiumDriver<WebElement> driver) {
        this.driver = driver;
        actionsWithOurElements = new ActionsWithOurElements(driver);
    }
}
