package com.magento.auto.StepDefs;

import com.magento.auto.Actions.ResultActions;
import com.magento.auto.Utils.BaseTest;
import com.magento.auto.Utils.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResultStepDef extends BaseTest {

    public WebDriver driver;
    public ResultActions resultActions;
    Map<String, Integer> allProductNamesAndRatings;
    Map<String, String> allProductNamesAndRatingsGreaterOrEqualToFour;

    public ResultStepDef() {
        this.driver = Hooks.driver;
        resultActions = new ResultActions(driver);
        allProductNamesAndRatings = new LinkedHashMap<>();
        allProductNamesAndRatingsGreaterOrEqualToFour = new LinkedHashMap<>();
    }

    @When("^User lands to the \"([^\"]*)\" page$")
    public void user_lands_to_the_page(String optionName){
        log.info("User lands on to the page");
        assertTrue(resultActions.validateOptionTitleIsPresent(optionName));
    }

    @And("^User validates the count of search results$")
    public void user_validates_the_count_of_search_result(){
        log.info("User validates the count of search results");
        int expectedCountFromUIDisplay = Integer.parseInt(resultActions.totalItemsCount());
        int actualCountOfProducts = resultActions.totalNumberOfProducts();
        assertEquals("Total Count of Products are mismatched", expectedCountFromUIDisplay, actualCountOfProducts);
    }

    @And("^User sorts products on the basis of rating in descending order$")
    public void user_products_on_the_basis_of_rating(){
        log.info("User sorts products on the basis of rating in descending order");
        resultActions.sortByRatingsInDescOrder();
    }

    @And("^User prints the products names and ratings$")
    public void user_prints_the_product_names_and_ratings(){
        log.info("User prints the products names and ratings");
        allProductNamesAndRatings = resultActions.printAllProductNamesWithRatings();
        for (Map.Entry<String, Integer> entry : allProductNamesAndRatings.entrySet()) {
            String jacketName = entry.getKey();
            String reviewStar = resultActions.getRatingStar(entry.getValue());
            log.info("Jacket Name : " + jacketName + " " + ", Review Stars : " + reviewStar);
        }
    }

    @And("^User clicks on Price tab$")
    public void user_clicks_on_price_tab() {
        log.info("User clicks on Price tab");
        resultActions.clickOnPriceTab();
    }

    @And("^User selects the price range \"([^\"]*)\"$")
    public void user_selects_the_price_range(String priceRange){
        log.info("User selects the price range");
        resultActions.implicitWait(90);
        resultActions.selectPriceRange(priceRange);
    }

    @Then("^User validates the products falling under the range \"([^\"]*)\"$")
    public void user_validates_products_falling_under_the_price_range(String priceRange) {
        log.info("User validates the products falling under the range");
        resultActions.implicitWait(4000);
        assertTrue(resultActions.validateProductsUnderPriceRange(priceRange));
    }

    @Then("^User counts the total products whose stars are equal or greater than four$")
    public void user_counts_the_total_products_whose_stars_are_equal_or_greater_than_four() {
        log.info("User counts the total products whose stars are equal or greater than four");
        log.info("Total Number of Jackets after applying price range : " + resultActions.totalNumberOfProducts());
        allProductNamesAndRatingsGreaterOrEqualToFour = resultActions.getProductsWithStarGreaterOrEqualToFour();
        log.info("Total Number of Jackets whose stars are equal or greater than four : " + allProductNamesAndRatingsGreaterOrEqualToFour.size());
    }

    @And("^User prints the name and price$")
    public void user_prints_the_name_and_price() {
        log.info("User prints the jackets name and price");
        for (Map.Entry<String, String> entry : allProductNamesAndRatingsGreaterOrEqualToFour.entrySet()) {
            String jacketName = entry.getKey();
            String jacketPrice = entry.getValue();
            log.info("Jacket Name : " + jacketName + " " + ", Jacket Price : " + jacketPrice);
        }
    }
}
