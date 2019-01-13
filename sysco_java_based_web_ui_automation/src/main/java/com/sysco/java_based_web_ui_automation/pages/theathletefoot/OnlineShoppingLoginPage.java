package com.sysco.java_based_web_ui_automation.pages.theathletefoot;

import com.sysco.java_based_web_ui_automation.utils.PageBase;
import org.openqa.selenium.By;

public class OnlineShoppingLoginPage extends PageBase {
    private By txtEmail = By.id("email");
    private By txtPassword = By.id("pass");
    private By btnLogin = By.id("send2");
    private By emailErrorMsg = By.id("email-error");
    private By passwordErrorMsg = By.id("pass-error");
    private By incorrectEmailOrPasswordMsg = By.xpath("//div[@class=\"message-error error message\"]/child::div");

    public void setTxtEmail(String email){
        syscoLabUI.clear(txtEmail);
        syscoLabUI.sendKeys(txtEmail,email);
    }

    public void setTxtPassword(String password){
        syscoLabUI.clear(txtPassword);
        syscoLabUI.sendKeys(txtPassword, password);
    }

    public void clickLogin(){ syscoLabUI.click(btnLogin);}

    public String getEmailIsRequiredMsg(){ return syscoLabUI.getText(emailErrorMsg);}

    public String getPasswordIsRequiredMsg(){ return syscoLabUI.getText(passwordErrorMsg); }

    public String getIncorrectEmailOrPasswordMsg(){ return  syscoLabUI.getText(incorrectEmailOrPasswordMsg); }

}
