Feature: feature to  test login functionality

  Scenario Outline: Check login is sucessful with valid credentials
    Given user is on Login page
    When user enter <username> and <password>
    And click on login button
    Then user navigated to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | admin123 |
