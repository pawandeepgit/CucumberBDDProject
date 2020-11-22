Feature: Test Facebook functionality

  Scenario: Validate account page is displayed if no password is entered
    Given I navigate to facebook page
    When I enter the username
    And I click the login button
    Then I will be navigated to account page

  Scenario: Validate account page is displayed if no password is entered
    Given I navigate to facebook page
    When I enter the username "test@gmail.com"
    And I click the login button
    Then I will be navigated to account page
