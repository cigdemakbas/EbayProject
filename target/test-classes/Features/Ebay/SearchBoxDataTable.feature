
Feature: eBay Search Functionality
  As a user
  I want to search for items with specific criteria
  So that I can verify advanced search functionality works correctly

  Scenario: Search for items with criteria
    Given Go to the home page
    When I search with the following criteria:
      | searchTerm | category |
      | laptop     | Art      |
      | shoes      | Baby     |
