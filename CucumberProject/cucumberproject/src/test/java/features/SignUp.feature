
@signup	@regression
Feature: Sign Up
  In order to verify Sign Up page
  As a user
  I want to validate all fields

  @signup1
  Scenario: In order to verify Sign Up without entering mandatory fields
    Given user navigates to Sign Up page
    When user validates Sign Up page title
    And user clicked on Register button without entering mandatory fields
    Then verify validation message

  @signup2
  Scenario: In order to verify Sign Up by entering mandatory fields
    Given user navigates to Sign Up page
    When user validates Sign Up page title
    And user entered data in all mandatory fields
    And user clicked on Register button
    Then user shouldbe successfully registered
