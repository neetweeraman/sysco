package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingItemsResultPage;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class OnlineShoppingItemsResult {
    public static OnlineShoppingItemsResultPage onlineShoppingItemsResultPage = new OnlineShoppingItemsResultPage();

    public static void selectARandomItemFromResults(){
        Random random = new Random();
        WebElement webElementSelectedItem = onlineShoppingItemsResultPage.getListOfProductItems().get(random.nextInt(onlineShoppingItemsResultPage.getListOfProductItems().size()));
        webElementSelectedItem.click();
    }
}
