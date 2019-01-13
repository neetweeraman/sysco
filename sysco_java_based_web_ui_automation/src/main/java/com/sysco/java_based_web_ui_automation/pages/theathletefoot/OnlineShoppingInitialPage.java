package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;

public class OnlineShoppingInitialPage extends PageBase {
    private By lnkLogin = By.xpath("//li[@class=\"authorization-link -notlogin\"]/child::a[contains(text(),\"Login\")]");

    public boolean loginLinkExists(){ return syscoLabUI.isDisplayed(lnkLogin); }

    public void clickLoginButton(){ syscoLabUI.click(lnkLogin); }
}
