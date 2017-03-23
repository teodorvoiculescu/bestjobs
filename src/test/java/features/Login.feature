@LoginOnBestjobs
Feature: Login on Bestjobs website

  Scenario: Login with existing email and password
    Given I am on mainpage
    And I click on "Intra in cont" section
    Then I should be on login page
    And I enter email: "voiculescuteodor@gmail.com"
    And I enter password: "password"
    Then I should see the list with jobs


  Scenario: Login with Facebook
    Given I am on mainpage
    And I click on "Intra in cont" section
    Then I should be on login page
