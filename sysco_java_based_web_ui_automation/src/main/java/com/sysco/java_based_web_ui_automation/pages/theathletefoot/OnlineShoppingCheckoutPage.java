package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class OnlineShoppingCheckoutPage extends PageBase {
    private By txtFirstName = By.xpath("//div[@name=\"shippingAddress.firstname\"]/div[1]/input[1]");
    private By txtLastName = By.xpath("//div[@name=\"shippingAddress.lastname\"]/div[1]/input[1]");
    private WebElement wefn = syscoLabUI.driver.findElement(By.xpath("//div[@name=\"shippingAddress.firstname\"]/div[1]/input[1]"));

//    public String getFirstNameText(){ return syscoLabUI.getText(txtFirstName); }
//    public String getLastNameText(){ return syscoLabUI.getText(txtLastName); }


}
