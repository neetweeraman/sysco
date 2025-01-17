package com.sysco.java_based_web_ui_automation.functions.theathletefoot;

import com.sysco.java_based_web_ui_automation.data.LoginData;
import com.sysco.java_based_web_ui_automation.pages.theathletefoot.OnlineShoppingCheckoutPage;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class OnlineShoppingCheckout {
    public static OnlineShoppingCheckoutPage onlineShoppingCheckoutPage = new OnlineShoppingCheckoutPage();
    public static WebElement webElementListOfPostCodes;

//    public static void firstName(){ onlineShoppingCheckoutPage.getFirstName(); }

    public static boolean verifyFirstName(LoginData loginData){
        if(onlineShoppingCheckoutPage.getFirstName().equalsIgnoreCase(loginData.firstName)){ return true; }
        else{ return false; }
    }

    public static boolean verifyLastName(LoginData loginData){
        if(onlineShoppingCheckoutPage.getLastName().equalsIgnoreCase(loginData.lastName)){return true;}
        else{return false; }
    }

    public static boolean continueWithoutRequiredFields(){
        onlineShoppingCheckoutPage.clickContinueButton();
        if(onlineShoppingCheckoutPage.requiredFieldDisplayed()){ return true; }
        else{ return false; }
    };

    public static void continueCheckout(LoginData loginData) throws InterruptedException {
        onlineShoppingCheckoutPage.enterValuesToCompanyTextBox();
        onlineShoppingCheckoutPage.enterValuesToAddressLine1();

        onlineShoppingCheckoutPage.enterValuesToPostCodeTextBox(loginData.getPostCode());
        Thread.sleep(3000);

        onlineShoppingCheckoutPage.selectPostCode();
        Thread.sleep(3000);

        onlineShoppingCheckoutPage.fillPhoneNumberTextBox(loginData.getPhoneNumber());
        onlineShoppingCheckoutPage.clickContinueButton();
        onlineShoppingCheckoutPage.clickPaymentMethodRadioButton();
    }
}
