package com.magento.auto.Actions;

import com.magento.auto.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomeActions extends HomePage {
    Actions actions;
    public HomeActions(WebDriver driver) {
        this.driver = driver;
        setDriver(driver);
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public Boolean validateDefaultTextIsPresent() {
        waitUntilElementDisplayed(defaultMessageText, 70);
        return isDisplayed(defaultMessageText);
    }

    public void hoverOverTopHeader(String headerName) {
        actions.moveToElement(topHeaderLink(headerName)).perform();
    }

    public void hoverOverSection(String sectionName) {
        actions.moveToElement(sectionLink(sectionName)).perform();
    }

    public void clickOnOption(String optionName) {
        actions.click(optionLink(optionName)).perform();
    }
}
