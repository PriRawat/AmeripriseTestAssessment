package com.magento.auto.Utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class Hooks {
    public static WebDriver driver;
    BaseTest baseTest = new BaseTest();
    @Before
    public void initDriver() {
       try {
           Config.loadData();
           Config.getConfigData();
           BaseTest.initLogs();
           driver = baseTest.getDriver();
           driver.get(Config.url);
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @After
    public void tearDown() {
        if ( driver != null) {
            try {
                driver.manage().deleteAllCookies();
                driver.quit();
            } catch (Exception e) {
                driver.quit();
                e.printStackTrace();
            }
        }
    }
}
