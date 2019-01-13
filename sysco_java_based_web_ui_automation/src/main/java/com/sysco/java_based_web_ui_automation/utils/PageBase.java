package com.sysco.java_based_web_ui_automation.utils;

import com.sysco.java_based_web_ui_automation.common.Constants;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PageBase {
    protected static SyscoLabUI syscoLabUI;

    public static void launchPageBase(){
        if(Constants.RUN_LOCALLY){
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            syscoLabUI = new SyscoLabWUI(capabilities);
            syscoLabUI.navigateTo(Constants.BASE_URL);
            syscoLabUI.driver.manage().window().maximize();
        }
        else{
            syscoLabUI = new SyscoLabWUI(DriverSetUpUtil.setToRunRemotely(Constants.APP_URL), Constants.BASE_URL);
            syscoLabUI.navigateTo(Constants.BASE_URL);
            syscoLabUI.driver.manage().window().maximize();
        }
    }

    public static void quitBrowser(){
        if (syscoLabUI != null) {
            syscoLabUI.quit();
        }
    }
}


