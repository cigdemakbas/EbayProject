@databasetesting
Feature: Employee Database Validation

  Scenario: Verify employee existence in the database
    Given I have connected to the database
    Then I verify that the employee with ID 1 exists in the database