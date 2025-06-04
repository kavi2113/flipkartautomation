@smoke
Feature: Feature to test Login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the Home page

    Examples:
    |username       |password    |
    | standard_user |secret_sauce|
    |problem_user   |secret_sauce|

  @smoke1 @regression
  Scenario: scenario2
    Given
    When
    And
    Then
