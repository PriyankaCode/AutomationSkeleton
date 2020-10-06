Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

  @smoketest
  Scenario: Home Page Default Login
    Given User is on Login Page
    When User sign in with Username and Password
    When User clicks on "Login" button
    Then Home Page is displayed
    And Company Logo is displayed
    When User clicks on "Logout" button

  @smoketest
  Scenario: Home Page Sign Up
    Given User is on Login Page
    When User enters sign up info
      | FirstName | LastName | Email                     | Phone     |
      | Priyanka  | Kanodia  | priyanka.knodia@gmail.com | 123456789 |
    When User clicks on "sign up" button
    Then Home Page is displayed
    And Company Logo is displayed
    When User clicks on "Logout" button

  Scenario: Home Page Sign Up
    Given User is on Login Page
    When User enters sign up info map
      | FirstName | Priyanka                  |
      | LastName  | Kanodia                   |
      | Email     | Priyanka.knodia@gmail.com |
      | Phone     |                1234567890 |
    When User clicks on "sign up" button
    Then Home Page is displayed
    And Company Logo is displayed
    When User clicks on "Logout" button
