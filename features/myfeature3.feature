Feature: Test SKY Sign-In functionalities

	@regression
  Scenario: Enter the form with valid data using datatables
    Given I navigate to sky page
    When I enter the form with details
      | Fields                | Values         |
      | First Name            | Vikram         |
      | Last Name             | Vikram         |
      | Email Address         | test@gmail.com |
      | Confirm Email Address | test@gmail.com |
    Then I click the cancel button
    And I validate the sky page
