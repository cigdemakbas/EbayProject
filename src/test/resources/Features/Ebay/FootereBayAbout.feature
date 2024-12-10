Feature: Footer links abouteBay Functionality
  As a user I want to ensure the "About eBay" link in the footer of the eBay homepage works correctly,
  So that I can navigate to the correct page and verify its content.

  Scenario: Click the about eBay footer link and verify the page.
    Given Go to the home page
    When I scroll to the footer section
    When I click on the link
    Then I should be navigated to the About eBay page

