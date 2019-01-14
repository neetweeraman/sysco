package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineShoppingCheckoutPage extends PageBase {
    private By txtFirstName = By.xpath("//div[@name=\"shippingAddress.firstname\"]/div[1]/input[1]");
    private By txtLastName = By.xpath("//div[@name=\"shippingAddress.lastname\"]/div[1]/input[1]");
    private By txtCompany = By.xpath("//div[@name=\"shippingAddress.company\"]/div[1]/input[1]");
    private By txtAddressLine1 = By.xpath("//div[@name=\"shippingAddress.street.0\"]/div[1]/input[1]");
    private By txtPostCode = By.xpath("//div[@name=\"shippingAddress.postcode\"]/div[1]/input[1]");
    private By txtPhoneNumber = By.xpath("//input[@name=\"telephone\"][1]");
    private By lblRequiredField = By.xpath("//div[@class=\"field-error mage-error\"]");
    private By btnContinue = By.xpath("//div[@class=\"opc-submit-step\"]/button[@class=\"button -primary -expanded\"]");
    private By autoCompletePostCodes = By.xpath("//li[@class=\"item ui-menu-item\"]");
    private By radioBtnPaymentMethod = By.xpath("//strong[text()=\"Credit Card\"]");

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
        syscoLabUI.sendKeys(txtPostCode, postCode);
        syscoLabUI.waitTillElementLoaded(autoCompletePostCodes);
    }

    public void selectPostCode() throws InterruptedException {
        List<WebElement> element = syscoLabUI.findElements(autoCompletePostCodes);
        syscoLabUI.click(element.get(1));
    }

    public void fillPhoneNumberTextBox(String phoneNumber) throws InterruptedException {
        syscoLabUI.scrollToElement(txtPhoneNumber);
        syscoLabUI.clickWithJavascript(txtPhoneNumber);
        syscoLabUI.sendKeys(txtPhoneNumber, phoneNumber);
    }

    public void clickPaymentMethodRadioButton(){ syscoLabUI.clickWithJavascript(radioBtnPaymentMethod); }
}
