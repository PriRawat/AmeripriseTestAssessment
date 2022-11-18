package com.magento.auto.StepDefs;

import com.magento.auto.Actions.HomeActions;
import com.magento.auto.Utils.BaseTest;
import com.magento.auto.Utils.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class HomeStepDef extends BaseTest {
    public WebDriver driver;
    public HomeActions homeActions;
    public HomeStepDef() {
        this.driver = Hooks.driver;
        homeActions = new HomeActions(driver);
    }
    @Given("^User navigates to the Magento application$")
    public void user_navigates_to_the_magento_application() {
        log.info("User validates Magento Application is launched");
        assertTrue(homeActions.validateDefaultTextIsPresent());
    }

    @When("^User hovers over \"([^\"]*)\" drop down$")
    public void user_hovers_over_drop_down(String headerName){
        log.info("User hovers over top header drop down");
        homeActions.hoverOverTopHeader(headerName);
    }

    @When("^User hovers on \"([^\"]*)\" section$")
    public void user_hovers_on_section(String sectionName){
        log.info("User hovers over section");
        homeActions.hoverOverSection(sectionName);
    }

    @When("^User clicks on \"([^\"]*)\" option$")
    public void user_clicks_on_option(String optionName){
        log.info("User clicks on the option");
        homeActions.clickOnOption(optionName);
    }

}
