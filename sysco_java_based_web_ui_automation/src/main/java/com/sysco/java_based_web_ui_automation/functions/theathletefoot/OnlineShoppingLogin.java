package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.data.LoginData;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingLoginPage;

public class OnlineShoppingLogin {
    public static OnlineShoppingLoginPage onlineShoppingLoginPage = new OnlineShoppingLoginPage();

    public static void loginToOnlineShoppingHomePage(LoginData loginData){
        onlineShoppingLoginPage.setTxtEmail(loginData.getUserName());
        onlineShoppingLoginPage.setTxtPassword(loginData.getPassword());
        onlineShoppingLoginPage.clickLogin();
    }

    public static String loginWithBlankCredentialsAndGetEmailRequiredMsg(){ return onlineShoppingLoginPage.getEmailIsRequiredMsg(); }

    public static String loginWithBlankCredentialsAndGetPasswordRequiredMsg(){ return onlineShoppingLoginPage.getPasswordIsRequiredMsg(); }

    public static String loginWithIncorrectCredentialsAndGetErrorMsg(){ return onlineShoppingLoginPage.getIncorrectEmailOrPasswordMsg(); }

}
