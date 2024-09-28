Feature: User Login

  Scenario: Successful login with valid credentials
  	When I go to the URL
    And I enter a valid username student and a valid password Password123
    And I click the submit button
    Then I should see a welcome message