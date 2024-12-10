Feature: Search Box Functionality
  As a user I want to click search box and research something

@smoke
  Scenario: Search for a valid product
    Given Go to the home page
    When click searchBox and write
    And I click the search button
    Then User should see the results
@smoke
  Scenario: Search for a invalid product
    Given Go to the home page
    When I enter searchBox
    And enter invalid product
    And I click the search button
    Then I should see a message

