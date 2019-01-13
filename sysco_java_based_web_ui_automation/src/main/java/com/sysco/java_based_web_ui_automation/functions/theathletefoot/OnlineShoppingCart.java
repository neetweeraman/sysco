package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingCartPage;

public class OnlineShoppingCart {
    public static OnlineShoppingCartPage onlineShoppingCartPage = new OnlineShoppingCartPage();

    public static boolean verifyCartItemName(String selectedItemName){
        if(onlineShoppingCartPage.getCartItemNameLabelText().equals(selectedItemName)){ return true; }
        else {return false; }
    }

    public static boolean verifyCartItemPrice(String selectedItemPrice){
        if(onlineShoppingCartPage.getCartItemPriceLabelText().equals(selectedItemPrice)){ return true; }
        else { return false; }
    }

    public static void goToCheckOutPage(){ onlineShoppingCartPage.clickProceedToCheckoutButton(); }
}
