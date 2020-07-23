package iosTest;

import org.junit.Test;
import parentTest.ParentTest;

import static libs.Utils.waitABit;

public class loginTest extends ParentTest {
    String login = "aezlogz@gmail.com";
    String pass = "1n91EfUV";

    @Test
    public void validLogin(){
        waitABit(20);
//        loginView.closeUpdatePopUp();
//        loginView.clickOnAccessLocationPopUp();
        loginView.clickOnLoginButton();
        loginView.enterLogin(login);
        loginView.enterPass(pass);
        loginView.clickOnSubmitLoginButton();

        loginView.clickOnDenyContactPopUp();
        loginView.clickOnDenyPhotoPopUp();
        waitABit(5);
        checkAC("Maine view is not displayed", loginView.isMainViewDisplayed(), true);

    }
}
