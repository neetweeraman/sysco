package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class OnlineShoppingCheckoutPage extends PageBase {
    private By txtFirstName = By.xpath("//div[@name=\"shippingAddress.firstname\"]/div[1]/input[1]");
    private By txtLastName = By.xpath("//div[@name=\"shippingAddress.lastname\"]/div[1]/input[1]");
    private By txtCompany = By.xpath("//div[@name=\"shippingAddress.company\"]/div[1]/input[1]");
    private By txtAddressLine1 = By.xpath("//div[@name=\"shippingAddress.street.0\"]/div[1]/input[1]");
    private By txtAddressLine2 = By.xpath("//div[@name=\"shippingAddress.street.1\"]/div[1]/input[1]");
    private By txtCity = By.xpath("//div[@name=\"shippingAddress.city\"]/div[1]/input[1]");
    private By ddStateOrProvince = By.xpath("//div[@name=\"shippingAddress.region_id\"]/div[1]/select[1]");
    private By txtPostCode = By.xpath("//div[@name=\"shippingAddress.postcode\"]/div[1]/input[1]");
    private By txtCountry = By.xpath("//div[@name=\"shippingAddress.country_id\"]/div[1]/select[1]");
    private By txtPhoneRegion = By.xpath("//div[@data-role=\"shippingAddress.telephone\"]/div[1]/select[1]");
    private By txtPhoneNumber = By.xpath("//div[@class=\"field _required -active\"]/div/input[@name=\"telephone\"]");
    private By lblRequiredField = By.xpath("//div[@class=\"field-error mage-error\"]");
    private By btnContinue = By.xpath("//div[@class=\"opc-submit-step\"]/button[@class=\"button -primary -expanded\"]");
    private By autoCompletePostCodes = By.xpath("//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]");
    private By chkAuthorityToLeave = By.xpath("//div[@name=\"shippingAddress.authority_to_leave\"]/div/div/input[@type=\"checkbox\"]");
    private By radioBtnPaymentMethod = By.id("braintree_paypal");

    public String getFirstName(){
        syscoLabUI.waitTillElementLoaded(txtFirstName);
        return syscoLabUI.getValue(txtFirstName).trim();
    }

    public String getLastName(){
        syscoLabUI.waitTillElementLoaded(txtLastName);
        return  syscoLabUI.getValue(txtLastName);
    }

    public boolean requiredFieldDisplayed(){ return syscoLabUI.isDisplayed(lblRequiredField); };

    public void clickContinueButton(){ syscoLabUI.click(btnContinue); }

    public void enterValuesToCompanyTextBox(){ syscoLabUI.sendKeys(txtCompany, "assignment_company"); }

    public void enterValuesToAddressLine1(){ syscoLabUI.sendKeys(txtAddressLine1, "assignment address line 1"); }

    public void enterValuesToPostCodeTextBox(String postCode){
        syscoLabUI.sendKeys(txtPostCode, postCode); }

    public List<WebElement> getSuggestedPostalCodes(){
        return syscoLabUI.findElements(autoCompletePostCodes);
    }

    public void fillPhoneNumberTextBox() throws InterruptedException {
        syscoLabUI.scrollToElement(txtPhoneNumber);
        syscoLabUI.clickWithJavascript(txtPhoneNumber);
        syscoLabUI.sendKeys(txtPhoneNumber, "1234567890");
    }

    public void checkAuthorityToLeaveCheckbox(){ syscoLabUI.click(chkAuthorityToLeave); }

    public void clickPaymentMethodRadioButton(){ syscoLabUI.click(radioBtnPaymentMethod); }
}
