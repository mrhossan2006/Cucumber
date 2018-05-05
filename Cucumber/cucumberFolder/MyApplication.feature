Feature: Test dice smoke scenario.

  Scenario: Test login with valid credentials.
    Given Open chrome browser.
    And Start Applicattion.
    When i click on login button.
    When I enter valid username and valid password.
    Then user should able to login successfully.