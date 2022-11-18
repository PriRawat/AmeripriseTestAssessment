package com.magento.auto.Actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonActions {
    public WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element) {
        waitUntilElementDisplayed(element, 20);
        element.click();
    }

    public Boolean waitUntilElementDisplayed(WebElement element, int timeInSeconds) {
        try {
            (new WebDriverWait(driver, timeInSeconds)).until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getText(WebElement element) {
        String emptyText = "";
        try {
            return element.getText();
        } catch (Throwable t) {
            t.printStackTrace();
            return emptyText;
        }
    }

    public String getAttributeValue(WebElement element, String attributeName) {
        String emptyText = "";
        try {
            return element.getAttribute(attributeName);
        } catch (Throwable t) {
            t.printStackTrace();
            return emptyText;
        }
    }

    public void staticWait(int timeInMilliSeconds) {
        try {
            Thread.sleep(timeInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void implicitWait(int timeInSeconds) {
        driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
    }
    public String replaceDollarSign(String str) {
        return str.replace("$", "");
    }


}
