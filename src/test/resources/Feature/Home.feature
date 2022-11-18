Feature: Search Results Feature

  @ApplyFilter
  Scenario Outline: User validates the applied filter on the basis of sorting and pricing
    Given User navigates to the Magento application
    When User hovers over "<topHeader>" drop down
    Then User hovers on "<sectionName>" section
    And User clicks on "<optionName>" option
    Then User lands to the "<optionName>" page
    And User validates the count of search results
    When User sorts products on the basis of rating in descending order
    Then User prints the products names and ratings
    And User clicks on Price tab
    When User selects the price range "<priceRange>"
    Then User validates the products falling under the range "<priceRange>"
    Then User counts the total products whose stars are equal or greater than four
    And User prints the name and price

    Examples:
    |  topHeader | sectionName | optionName |  priceRange   |
    |    Women   |     Tops    |    Jackets | $60.00-$69.99 |