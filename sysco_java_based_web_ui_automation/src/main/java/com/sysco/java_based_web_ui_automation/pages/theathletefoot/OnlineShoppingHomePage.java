package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;

public class OnlineShoppingHomePage extends PageBase {
    private By lnkLogout = By.xpath("//li[@class=\"authorization-link\"]/child::a[contains(text(),\"Logout\")]");
    private By lblUserFullName = By.xpath("//span[@class=\"name\"]/span");
    private By iconCart = By.xpath("//span[@class=\"showcart-trigger header-sidebar-link -cart\"]");
    private By iconCloseCart = By.xpath("//div[@class=\"close\"]");
    private By lblCartTitle = By.xpath("//div[@id=\"minicartOffcanvas\"]/div/div/strong");
    private By iconCartQuantityValue = By.xpath("//span[@class=\"counter qty\"]/span[@class=\"value\"]");
    private By lnkRemoveIcon = By.xpath("//a[@title=\"Remove item\"]");
    private By btnAcceptRemove = By.xpath("//div[@class=\"modal-inner-wrap\"]/footer/button[@class=\"action-primary action-accept button -secondary\"]");
    private By lnkMenuItem = By.xpath("//a[@title=\"Womens\"]");
    private By lnkCategory = By.id("mi-3-1-3-1");


    public boolean logoutLinkExists(){return syscoLabUI.isDisplayed(lnkLogout); }

    public String getLblUserFullName(){
        syscoLabUI.waitTillElementLoaded(lblUserFullName);
        return syscoLabUI.getText(lblUserFullName);
    }

    public void clickCartButton(){
        syscoLabUI.click(iconCart);
    }

    public void clickCloseCartIcon(){ syscoLabUI.clickWithJavascript(iconCloseCart); }

    public String getCartTitle(){ return syscoLabUI.getText(lblCartTitle); }

    public boolean isCartValueDisplayed(){ return syscoLabUI.isDisplayed(iconCartQuantityValue); }

    public void clickRemoveIcon(){ syscoLabUI.click(lnkRemoveIcon); }

    public List<WebElement> getListOfRemoveIcons(){ return syscoLabUI.findElements(lnkRemoveIcon); }

    public void clickAcceptRemoveButton(){ syscoLabUI.click(btnAcceptRemove);}

    public void clicKOnWomensMenuItem(){ syscoLabUI.clickWithJavascript(lnkMenuItem); }

    public void clickOnRunCategoryUnderWomenMenu(){ syscoLabUI.clickWithJavascript(lnkCategory); }



    public void delayProcess(int seconds){ syscoLabUI.sleep(seconds); }



}
