package com.sysco.java_based_web_ui_automation.functions;

import com.sysco.java_based_web_ui_automation.common.Constants;
import com.sysco.java_based_web_ui_automation.pages.LoginPage;
import com.sysco.java_based_web_ui_automation.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login  {

    public static LoginPage loginPage = new LoginPage();


    public static void loadLoginPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            loginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            loginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void quiteDriver() {
        loginPage.quitDriver();
    }

    public static void searchGoogle() {
        loginPage.enterText("Apple");
    }
}
