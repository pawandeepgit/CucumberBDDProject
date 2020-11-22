Feature: Test SKY Page functionality

  Scenario: To validate new account is not created after clicking the cancel button
    Given I navigate to SKY-Sign up page
    When I enter the form with the details
    And I click the cancel button
    Then I land on the sky page
