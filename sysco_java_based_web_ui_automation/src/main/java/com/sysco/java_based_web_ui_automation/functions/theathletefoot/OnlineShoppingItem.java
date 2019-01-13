package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.common.Constants;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingHomePage;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingItemPage;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class OnlineShoppingItem {
    public static OnlineShoppingItemPage onlineShoppingItemPage = new OnlineShoppingItemPage();
    public static OnlineShoppingHomePage onlineShoppingHomePage = new OnlineShoppingHomePage();

    public static Random random = new Random();
    private static String selectedItemName;
    private static String selectedItemPrice;

    public static boolean addItemToCart(){

        onlineShoppingItemPage.clickSizeTypesList();

        WebElement webElementSizeTypes = onlineShoppingItemPage.getListOfSizeTypes().get(random.nextInt(onlineShoppingItemPage.getListOfSizeTypes().size()));
        webElementSizeTypes.click();

        onlineShoppingItemPage.clickSizeTypesList();

        WebElement webElementItemSize = onlineShoppingItemPage.getListOfItemSizes().get(random.nextInt(onlineShoppingItemPage.getListOfItemSizes().size()));
        webElementItemSize.click();

        onlineShoppingItemPage.clickAddToCartButton();


        if(onlineShoppingItemPage.getAddedToCartSuccessMsg().contains(Constants.EXPECTED_ITEM_ADDED_MSG)){
            return true;
        }
        else {
            return false;
        }

    }

    public static void goToCartPage(){
        onlineShoppingHomePage.clickCartButton();
        onlineShoppingItemPage.clickViewCartButton();
    }

    public static String getSelectedItemName(){
        selectedItemName = onlineShoppingItemPage.getSelectedItemNameLabelText();
        return selectedItemName;
    }

    public static String getSelectedItemPrice(){
        selectedItemPrice = onlineShoppingItemPage.getSelectedItemPriceLabelText();
        return selectedItemPrice;
    }

}
