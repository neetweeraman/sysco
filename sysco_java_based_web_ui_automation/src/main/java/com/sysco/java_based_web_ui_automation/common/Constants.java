package com.sysco.java_based_web_ui_automation.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "<release name>");
    public static final String TEST_PROJECT = System.getProperty("test.project", "<project name>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.google.com");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");

    public static final String BASE_URL = System.getProperty("app.url", "https://www.theathletesfoot.com.au/");

    public static final String EXPECTED_MSG_REQUIRED_FIELD= "THIS IS A REQUIRED FIELD.";
    public static final String EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS = "YOU DID NOT SIGN IN CORRECTLY OR YOUR ACCOUNT IS TEMPORARILY DISABLED.";
    public static final String EXPECTED_CART_TITLE = "SHOPPING CART";
    public static final String EXPECTED_ITEM_ADDED_MSG = "You added";

}