Feature: feature to  test login functionality
 Scenario: Check login is sucessful with valid credentials
    Given user is on Login page
    When user enter username ans password
    And click on login button
    Then user navigated to the home page
