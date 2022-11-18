package com.magento.auto.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        tags = {"@ApplyFilter"},
        glue = {"com.magento.auto"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports/All", "json:target/cucumber-reports/All.json"},
        features = "src/test/resources/Feature/")
public class Runner {
}
