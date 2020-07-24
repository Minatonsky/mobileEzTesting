package iosTest;

import org.json.simple.JSONObject;
import org.junit.Test;
import parentTest.ParentTest;
import static libs.Utils.*;

import static libs.Utils.waitABit;

public class loginTest extends ParentTest {


    JSONObject jo = (JSONObject) readJsonSimpleDemo(configProperties.DATA_FILE_PATH()+"driverLoginWithTeamDriver_Osnova.json");

    public loginTest() throws Exception {
    }
    String login = jo.get("login").toString();
    String pass = jo.get("pass").toString();
    String teamDriver = jo.get("teamDriver").toString();

    @Test
    public void validLogin(){
        loginView.clickOnLoginButton();
        loginView.enterLogin(login);
        loginView.enterPass(pass);
        loginView.clickOnSubmitLoginButton();
        loginView.closeTeamDriverPopup(teamDriver);

        checkAC("Maine view is not displayed", loginView.isMainViewDisplayed(), true);
        navigateMenu.doLogout();

    }
}
