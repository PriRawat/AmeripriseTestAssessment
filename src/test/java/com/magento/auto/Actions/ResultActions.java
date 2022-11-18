package com.magento.auto.Actions;

import com.magento.auto.Pages.ResultPage;
import com.magento.auto.Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.*;

public class ResultActions extends ResultPage {

    public List<Map.Entry<String, Integer>> productsList;

    public ResultActions(WebDriver driver) {
        this.driver = driver;
        setDriver(driver);
        PageFactory.initElements(driver, this);
    }

    public Boolean validateOptionTitleIsPresent(String optionName) {
        waitUntilElementDisplayed(optionAsHeading(optionName), 60);
        return isDisplayed(optionAsHeading(optionName));
    }

    public String totalItemsCount() {
        return getText(totalCount);
    }

    public int totalNumberOfProducts() {
        implicitWait(200);
        return listOfProducts.size();
    }

    private Map<String, Integer> getProductNameWithRatings() {
        Map<String, Integer> productsWithRating = new LinkedHashMap<>();
        String rating;
        for (WebElement ele : productNames) {
            String productName = getText(ele).trim();
            try {
                rating = (getAttributeValue(productRating(productName), "title")).replace(Constants.PERCENT_CHARACTER, "");
            } catch (Exception e) {
                rating = "0";
            }
            productsWithRating.put(productName, Integer.parseInt(rating));
        }
        return productsWithRating;
    }

    public void sortByRatingsInDescOrder() {
        Map<String, Integer> products = getProductNameWithRatings();
        productsList = new LinkedList<>(products.entrySet());
        Collections.sort(productsList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    }

    public Map<String, Integer> printAllProductNamesWithRatings() {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : productsList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public String getRatingStar(Integer val) {
        String str;
        float starValue = (float)val/20f;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(1);
        str = (decimalFormat.format(starValue))+ Constants.STAR_CHARACTER;
        return str;
    }

    public void clickOnPriceTab() {
        click(priceTab);
    }

    public void selectPriceRange(String priceRange) {
        click(priceRange(priceRange.split(Constants.HYPHEN_CHARACTER)[0]));
    }

    public Boolean validateProductsUnderPriceRange(String priceRange) {
        boolean flag = false;
        String range[] = priceRange.split(Constants.HYPHEN_CHARACTER);
        float lowerRange = Float.parseFloat(replaceDollarSign(range[0]));
        float higherRange = Float.parseFloat(replaceDollarSign(range[1]));
        for (WebElement ele : productPrices) {
            float priceValue = Float.parseFloat(replaceDollarSign(ele.getText()));
            if (priceValue >= lowerRange && priceValue <=higherRange) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public Map<String, String> getProductsWithStarGreaterOrEqualToFour() {
        Map<String, String> productsNamesAndPrice = new LinkedHashMap<>();
        Map<String, Integer> products = getProductNameWithRatings();
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() >= Constants.FOUR_STAR_VALUE) {
                productsNamesAndPrice.put(entry.getKey(), getText(productPricing(entry.getKey())));
            }
        }
        return productsNamesAndPrice;
    }

}
