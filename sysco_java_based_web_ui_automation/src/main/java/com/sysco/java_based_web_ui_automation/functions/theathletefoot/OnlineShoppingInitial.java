package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.data.LoginData;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingInitialPage;

public class OnlineShoppingInitial {
    public static OnlineShoppingInitialPage onlineShoppingInitialPage = new OnlineShoppingInitialPage();

    public static boolean verifyOnlineShoppingInitialPage(){
        if(onlineShoppingInitialPage.loginLinkExists()){ return true; }
        else{ return false; }
    }

    public static void goToOnlineShoppingLoginPage(){
        onlineShoppingInitialPage.clickLoginButton();
    }
}
