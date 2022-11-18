package com.magento.auto.Pages;

import com.magento.auto.Actions.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonActions {

    @FindBy(xpath = "//div[@class='panel header']//span[text()='Default welcome msg!']")
    public WebElement defaultMessageText;

    public WebElement topHeaderLink(String headerName) {
        return driver.findElement(By.xpath("//span[text()='"+headerName+"']"));
    }

    public WebElement sectionLink(String sectionName) {
        return driver.findElement(By.xpath("//span[text()='"+sectionName+"']"));
    }

    public WebElement optionLink(String optionName) {
        return driver.findElement(By.xpath("//span[text()='"+optionName+"']//parent::a"));
    }
}
