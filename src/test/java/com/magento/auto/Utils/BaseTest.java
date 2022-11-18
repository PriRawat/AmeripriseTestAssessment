package com.magento.auto.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;


public class BaseTest {
    public static WebDriver driver;
    public static Logger log = null;

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/bin/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static void initLogs() {
        if(log == null) {
            // Initialize Log4j logs
            DOMConfigurator.configure(System.getProperty("user.dir")+ File.separator+"config"+File.separator+"log4j.xml");
            log = Logger.getLogger("My Logs");
            log.info("Logger is initialized..");
        }
    }


}
