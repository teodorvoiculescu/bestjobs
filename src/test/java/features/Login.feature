@LoginOnBestjobs
Feature: Login on Bestjobs website
  Scenario: Login with existing email and password
    Given I am on mainpage with title: "Locuri de munca | BestJobs"
   # And I click on "Intra in cont" link
    And I click on enter account link
    Then I enter username : "bestjobstesting@gmail.com"
    And  I enter password : "qwerty_bestjobstesting"
    And I click on login button
#    Then I should be logged in
    Then I log out