package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineShoppingItemsResultPage extends PageBase {
    private By lnkProductItem = By.xpath("//a[@class=\"product-item-link\"]");

    public List<WebElement> getListOfProductItems(){ return syscoLabUI.findElements(lnkProductItem); }
}
