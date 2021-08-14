@smokeTest @regressionTest @jenkinsTest
Feature: Verify login feature to Orange HRM website

  Scenario: User able to successfully login to Orange HRM site
    Given user go to Orange Hrm home page
    When user enter valid username and password
    And user click on the log in button
    Then user navigate to the welcome page
    And user verify the page title as "OrangeHRM"
    And user verify user name is displays at top right
    Then user log out
    And user close browser
