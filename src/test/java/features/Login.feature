@LoginOnBestjobs
Feature: Login on Bestjobs website

  @LoginCorrectEmailAndPassword
  Scenario: Login with existing email and password
    Given I am on mainpage with title: "Locuri de munca | BestJobs"
   # And I click on "Intra in cont" link
    And I click on enter account link
    Then I enter username : "bestjobstesting@gmail.com"
    And  I enter password : "qwerty_bestjobstesting"
    And I click on login button
    Then I log out

  @LoginCorrectEmailAndIncorrectPassword
  Scenario: Login with existing email and incorrect password
    Given I am on mainpage with title: "Locuri de munca | BestJobs"
    And I click on enter account link
    Then I enter username : "bestjobstesting@gmail.com"
    And I enter password : "wrong_password"
    And I click on login button
#    Then I log out

  Scenario: Login with incorrect email and correct password
    Given I am on mainpage with title: "Locuri de munca | BestJobs"
    And I click on enter account link
    Then I enter username : "wrong_username"
    And I enter password : "qwerty_bestjobstesting"
    And I click on login button
 #   Then I log out