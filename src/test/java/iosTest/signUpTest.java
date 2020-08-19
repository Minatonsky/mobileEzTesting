package iosTest;

import org.junit.Test;
import parentTest.ParentTest;

import static libs.Utils.waitABit;

public class signUpTest extends ParentTest {

    @Test
    public void validSignUp() {
        loginView.clickOnUpdateCancelButton();
        loginView.clickOnSignUpButton();
        signUpView.clickOnUserTypeButton();
        signUpView.clickOnDriverTypeButton();
        signUpView.enterFirstName("vasya");
        signUpView.enterLastName("bobobo");
        signUpView.enterPhone("0000000000");
        signUpView.enterEmail("vasya12345@gmail.com");
        signUpView.enterPass("123456");
        signUpView.enterPassConf("123456");
        signUpView.clickOnAcceptButton();
        signUpView.clickOnSignUpButton();
    }

}
