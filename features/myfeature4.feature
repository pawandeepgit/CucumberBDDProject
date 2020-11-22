Feature: Test Scenario Outline Datatable

  Background: Navigate to facebook page
    Given I navigate to facebook page

  Scenario Outline: Login functionality for a social networking site
    When I enter the username "<email>" and password "<password>"
    And I click the login button

    Examples: 
      | email           | password  |
      | test1@gmail.com | password1 |
      | test2@gmail.com | password2 |