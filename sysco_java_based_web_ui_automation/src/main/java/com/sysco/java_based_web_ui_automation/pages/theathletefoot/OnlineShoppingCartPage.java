package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;

public class OnlineShoppingCartPage extends PageBase {
    private By lblCartItemName = By.xpath("//div[@class=\"item-details\"]/strong[@class=\"name\"]");
    private By lblCartItemPrice = By.xpath("//td[@class=\"col price\"]/span/span/span[@class=\"price\"]");
//    private By btnProceedToCheckOut = By.xpath("//button[@title=\"Proceed To Checkout\"]");
    private  By btnProceedToCheckOut = By.xpath("//button[@class=\"action button -primary primary -expanded checkout\"]/span");

    public String getCartItemNameLabelText() { return syscoLabUI.getText(lblCartItemName); }

    public String getCartItemPriceLabelText() { return syscoLabUI.getText(lblCartItemPrice); }

    public void clickProceedToCheckoutButton(){ syscoLabUI.clickWithJavascript(btnProceedToCheckOut); }
}
