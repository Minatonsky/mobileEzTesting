
import org.json.simple.JSONObject;
import org.junit.Test;
import parentTest.ParentTest;

import static libs.Utils.readJsonSimpleDemo;
import static libs.Utils.waitABit;

public class loginTest extends ParentTest {

    JSONObject jsonObject = (JSONObject) readJsonSimpleDemo (configProperties.DATA_FILE_PATH() + "driverOsnova.json");

    public loginTest() throws Exception {
    }


    @Test
    public void validLogin(){
        waitABit(20);
//        loginView.closeUpdatePopUp();
        loginView.clickOnLoginButton();
        loginView.enterLogin(jsonObject.get("login").toString());
        loginView.enterPass(jsonObject.get("pass").toString());
        loginView.clickOnSubmitLoginButton();
        loginView.clickOnAccessLocationPopUp();
        loginView.clickOnDenyContactPopUp();
        loginView.clickOnDenyPhotoPopUp();
        waitABit(5);
        checkAC("Maine view is not displayed", loginView.isMainViewDisplayed(), true);

    }
}
