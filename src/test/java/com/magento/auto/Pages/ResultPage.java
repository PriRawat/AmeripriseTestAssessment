package com.magento.auto.Pages;

import com.magento.auto.Actions.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends CommonActions {

    @FindBy(xpath = "//p[@id='toolbar-amount']/span")
    public WebElement totalCount;

    @FindBy(xpath = "//li[contains(@class,'product-item')]")
    public List<WebElement> listOfProducts;

    @FindBy(xpath = "//div[contains(@class,'product-item-details')]/strong/a")
    public List<WebElement> productNames;

    @FindBy(xpath = "//div[text()='Price']")
    public WebElement priceTab;

    @FindBy(xpath = "//span[@class='price']")
    public List<WebElement> productPrices;
//    public WebElement getPPrices(int i) {
//        return driver.findElement(By.xpath("(//span[@class='price'])["+i+"]"));
//    }
    public WebElement optionAsHeading(String optionName) {
        return driver.findElement(By.xpath("//main[@id='maincontent']//span[text()='"+optionName+"']"));
    }

    public WebElement productRating(String productName) {
        return driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]//parent::strong//following-sibling::div//div[contains(@class,'rating-summary')]//div[@class='rating-result']"));
    }

    public WebElement priceRange(String lowerRange) {
        return driver.findElement(By.xpath("//div[text()='Price']//parent::div//div[@class='filter-options-content']//li//a//span[contains(text(),'"+lowerRange+"')]"));
    }

    public WebElement totalCountBasedOnPrices(String lowerRange) {
        return driver.findElement(By.xpath("//div[text()='Price']//parent::div//div[@class='filter-options-content']//li//a//span[contains(text(),'"+lowerRange+"')]//parent::a//span[@class='count']"));
    }

    public WebElement productPricing(String productName) {
        return driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]//ancestor::div[contains(@class,'product-item-details')]//div[contains(@class,'price-final_price')]//span[contains(@id,'product-price')]/span"));
    }
}
