package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.data.LoginData;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingHomePage;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class OnlineShoppingHome {
    public static OnlineShoppingHomePage onlineShoppingHomePage = new OnlineShoppingHomePage();

    public static boolean verifyUserSuccessfullyLoggedIn(){
        if(onlineShoppingHomePage.logoutLinkExists()){ return true; }
        else{ return false; }
    }

    public static boolean verifyUsersFullName(LoginData loginData) {
        String usersFullName = loginData.getFirstName() + " " + loginData.getLastName();
        if(usersFullName.equalsIgnoreCase(onlineShoppingHomePage.getLblUserFullName())){ return true; }
        else{ return false; }
    }

//    public static void goToCart(){ onlineShoppingHomePage.clickCartButton(); }

    public static String getCartBlockTitle(){ return onlineShoppingHomePage.getCartTitle(); }

    public static boolean removeItemsInCart(){
        boolean isEmpty = false;
        if(onlineShoppingHomePage.isCartValueDisplayed()){
            isEmpty = false;
            onlineShoppingHomePage.clickCartButton();
            int size = onlineShoppingHomePage.getListOfRemoveIcons().size();
            for(int i = 0; i<size; i++) {
                onlineShoppingHomePage.delayProcess(5);
                onlineShoppingHomePage.clickRemoveIcon();

                onlineShoppingHomePage.delayProcess(5);
                onlineShoppingHomePage.clickAcceptRemoveButton();
            }
            size = onlineShoppingHomePage.getListOfRemoveIcons().size();

            if(size == 1){
                isEmpty = true;
            }
            else{
                isEmpty = false;
            }
            onlineShoppingHomePage.clickCloseCartIcon();
        }
        else{
            System.out.println("There are no items in the shopping cart to remove.");
            isEmpty = true;
        }
        return isEmpty;
    }

    public static void selectCateory(){
        onlineShoppingHomePage.clicKOnWomensMenuItem();
        onlineShoppingHomePage.clickOnRunCategoryUnderWomenMenu();

    }

}
