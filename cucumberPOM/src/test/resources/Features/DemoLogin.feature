# login.feature
Feature: Login
  Scenario: Successful login
    Given user is on the login page
    When user enters username "student" and password "Password123"
    And user clicks on the login button
    Then user should be logged in
