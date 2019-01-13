package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineShoppingItemPage extends PageBase {
    private By lstSizeType = By.xpath("//div[@role=\"tablist\"]/div[@class=\"heading\"]/span[@class=\"name\"]");
    private By lnkSizeType = By.xpath("//div[@class=\"list\"]/a[starts-with(@class, \"item\")]");
    private By btnItemSize = By.xpath("//div[@class=\"swatch-attribute-options swatch-matrix clearfix\"]/div[@class=\"swatch-row -active\"]/div[@class=\"swatch-option text\"]");
    private By btnAddToCart = By.id("product-addtocart-button");
    private By lblAddedToCartMsg = By.xpath("//div[@class=\"message-success success message\"]/div");
    private By getLblSelectedItemName = By.xpath("//h1[@class=\"page-title  product\"]/span[@class=\"base\"]");
    private By lblSelectedItemPrice = By.xpath("//div[@class=\"product-info-price\"]/div[1]/span/span/span[@class=\"price\"]");
    private By btnViewCart = By.xpath("//a[@class=\"button\"]/span");


    public void clickSizeTypesList(){ syscoLabUI.click(lstSizeType);}

    public List<WebElement> getListOfSizeTypes(){ return syscoLabUI.findElements(lnkSizeType); }

    public List<WebElement> getListOfItemSizes(){ return  syscoLabUI.findElements(btnItemSize); }

    public void clickAddToCartButton(){ syscoLabUI.click(btnAddToCart); }

    public String getAddedToCartSuccessMsg(){
        syscoLabUI.waitTillElementLoaded(lblAddedToCartMsg);
        return syscoLabUI.getText(lblAddedToCartMsg);
    }

    public String getSelectedItemPriceLabelText(){ return syscoLabUI.getText(lblSelectedItemPrice); }

    public String getSelectedItemNameLabelText(){ return syscoLabUI.getText(getLblSelectedItemName); }

    public void clickViewCartButton(){ syscoLabUI.clickWithJavascript(btnViewCart);}
}