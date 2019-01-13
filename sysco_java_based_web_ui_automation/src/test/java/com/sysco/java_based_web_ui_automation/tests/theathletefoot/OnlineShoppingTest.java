package com.sysco.java_based_web_ui_automation.tests.theathletefoot;

import com.sysco.java_based_web_ui_automation.common.Constants;
import com.sysco.java_based_web_ui_automation.data.LoginData;
import com.sysco.java_based_web_ui_automation.functions.theathletefoot.*;
import com.sysco.java_based_web_ui_automation.utils.ExcelUtil;
import com.sysco.java_based_web_ui_automation.utils.TestBase;
import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OnlineShoppingTest extends TestBase {
    private static LoginData loginData;


    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "checkout");
    }

    @Test(priority=1)
    public void testOnlineShoppingInitialPageVerify(){
        Assert.assertTrue(OnlineShoppingInitial.verifyOnlineShoppingInitialPage());
        OnlineShoppingInitial.goToOnlineShoppingLoginPage();
    }

    @Test(priority = 2)
    public void testLogin(){
        SoftAssert softAssert = new SoftAssert();
        loginData = ExcelUtil.getLoginData("login_1");
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertEquals(OnlineShoppingLogin.loginWithBlankCredentialsAndGetEmailRequiredMsg(), Constants.EXPECTED_MSG_REQUIRED_FIELD,"Blnk Email - An error");

        loginData = ExcelUtil.getLoginData(("login_2"));
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertEquals(OnlineShoppingLogin.loginWithBlankCredentialsAndGetPasswordRequiredMsg(), Constants.EXPECTED_MSG_REQUIRED_FIELD,  "Blank Password - An error");

        loginData = ExcelUtil.getLoginData("login_3");
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertEquals(OnlineShoppingLogin.loginWithIncorrectCredentialsAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS,"Incorrect password - An error");

        loginData = ExcelUtil.getLoginData("login_4");
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertEquals(OnlineShoppingLogin.loginWithIncorrectCredentialsAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS,"Incorrect email - An error");

        loginData = ExcelUtil.getLoginData("login_5");
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertEquals(OnlineShoppingLogin.loginWithIncorrectCredentialsAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS, "Incorrect email and password - An error");

        loginData = ExcelUtil.getLoginData("login_6");
        OnlineShoppingLogin.loginToOnlineShoppingHomePage(loginData);
        softAssert.assertTrue(OnlineShoppingHome.verifyUserSuccessfullyLoggedIn(), "Successful login - Navigate to Home");

        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testLoggedInUserName(){
        Assert.assertTrue(OnlineShoppingHome.verifyUsersFullName(loginData));
    }

    @Test(priority = 4)
    public void testRemoveItemsFromCart() throws InterruptedException { Assert.assertTrue(OnlineShoppingHome.removeItemsInCart()); }

    @Test(priority = 5)
    public void testAddItemToCart() throws InterruptedException {
        OnlineShoppingHome.selectCateory();
        OnlineShoppingItemsResult.selectARandomItemFromResults();
        Assert.assertTrue(OnlineShoppingItem.addItemToCart());
    }

    @Test(priority = 6)
    public void testItemNameAndPriceInCart() {
        SoftAssert softAssert = new SoftAssert();

        String selectedItemName = OnlineShoppingItem.getSelectedItemName();
        String selectedItemPrice = OnlineShoppingItem.getSelectedItemPrice();
        OnlineShoppingItem.goToCartPage();

        softAssert.assertTrue(OnlineShoppingCart.verifyCartItemName(selectedItemName));
        softAssert.assertTrue(OnlineShoppingCart.verifyCartItemPrice(selectedItemPrice));

        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void testCheckout(){
        OnlineShoppingCart.goToCheckOutPage();
    }
}
