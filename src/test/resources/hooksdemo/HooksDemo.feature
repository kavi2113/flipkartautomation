Feature: Feature to test Login functionality

  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the Home page

  Scenario: Check login is successful with invalid credentials

    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then user is navigated to the Home page