package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import libs.ActionsWithOurElements;


public class ParentView {

    AndroidDriver<AndroidElement> driver;
    ActionsWithOurElements actionsWithOurElements;

    public ParentView(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        actionsWithOurElements = new ActionsWithOurElements(driver);
    }
}
