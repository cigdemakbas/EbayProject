Feature: eBay Simple Search
  As a user
  I want to search for items on eBay
  So that I can verify the search functionality works with different terms

  Scenario: Search for multiple items
    Given Go to the home page
    When I search for the following items:
      | items |
      | sapka |
      | soap  |
      | table |
    Then I should see relevant search results for all items