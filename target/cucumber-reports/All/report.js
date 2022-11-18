$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Search Results Feature",
  "description": "",
  "id": "search-results-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User validates the applied filter on the basis of sorting and pricing",
  "description": "",
  "id": "search-results-feature;user-validates-the-applied-filter-on-the-basis-of-sorting-and-pricing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ApplyFilter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to the Magento application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User hovers over \"\u003ctopHeader\u003e\" drop down",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User hovers on \"\u003csectionName\u003e\" section",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"\u003coptionName\u003e\" option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User lands to the \"\u003coptionName\u003e\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User validates the count of search results",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sorts products on the basis of rating in descending order",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User prints the products names and ratings",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Price tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects the price range \"\u003cpriceRange\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User validates the products falling under the range \"\u003cpriceRange\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User counts the total products whose stars are equal or greater than four",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User prints the name and price",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "search-results-feature;user-validates-the-applied-filter-on-the-basis-of-sorting-and-pricing;",
  "rows": [
    {
      "cells": [
        "topHeader",
        "sectionName",
        "optionName",
        "priceRange"
      ],
      "line": 20,
      "id": "search-results-feature;user-validates-the-applied-filter-on-the-basis-of-sorting-and-pricing;;1"
    },
    {
      "cells": [
        "Women",
        "Tops",
        "Jackets",
        "$60.00-$69.99"
      ],
      "line": 21,
      "id": "search-results-feature;user-validates-the-applied-filter-on-the-basis-of-sorting-and-pricing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6532144400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User validates the applied filter on the basis of sorting and pricing",
  "description": "",
  "id": "search-results-feature;user-validates-the-applied-filter-on-the-basis-of-sorting-and-pricing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ApplyFilter"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to the Magento application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User hovers over \"Women\" drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User hovers on \"Tops\" section",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"Jackets\" option",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User lands to the \"Jackets\" page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User validates the count of search results",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sorts products on the basis of rating in descending order",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User prints the products names and ratings",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Price tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User selects the price range \"$60.00-$69.99\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User validates the products falling under the range \"$60.00-$69.99\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User counts the total products whose stars are equal or greater than four",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User prints the name and price",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDef.user_navigates_to_the_magento_application()"
});
formatter.result({
  "duration": 730532800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Women",
      "offset": 18
    }
  ],
  "location": "HomeStepDef.user_hovers_over_drop_down(String)"
});
formatter.result({
  "duration": 172752100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tops",
      "offset": 16
    }
  ],
  "location": "HomeStepDef.user_hovers_on_section(String)"
});
formatter.result({
  "duration": 190329400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jackets",
      "offset": 16
    }
  ],
  "location": "HomeStepDef.user_clicks_on_option(String)"
});
formatter.result({
  "duration": 1751936300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jackets",
      "offset": 19
    }
  ],
  "location": "ResultStepDef.user_lands_to_the_page(String)"
});
formatter.result({
  "duration": 369023500,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_validates_the_count_of_search_result()"
});
formatter.result({
  "duration": 144227700,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_products_on_the_basis_of_rating()"
});
formatter.result({
  "duration": 201053118600,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_prints_the_product_names_and_ratings()"
});
formatter.result({
  "duration": 9394900,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_clicks_on_price_tab()"
});
formatter.result({
  "duration": 166473500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$60.00-$69.99",
      "offset": 30
    }
  ],
  "location": "ResultStepDef.user_selects_the_price_range(String)"
});
formatter.result({
  "duration": 1969841500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$60.00-$69.99",
      "offset": 53
    }
  ],
  "location": "ResultStepDef.user_validates_products_falling_under_the_price_range(String)"
});
formatter.result({
  "duration": 135124600,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_counts_the_total_products_whose_stars_are_equal_or_greater_than_four()"
});
formatter.result({
  "duration": 317200700,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.user_prints_the_name_and_price()"
});
formatter.result({
  "duration": 1020600,
  "status": "passed"
});
formatter.after({
  "duration": 1107542000,
  "status": "passed"
});
});