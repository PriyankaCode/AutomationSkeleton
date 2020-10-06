Feature: Signing Up as new user
  I want to use this template for my feature file

  @smoketest2
  Scenario Outline: Multiple dataset signup
    Given User is on Login Page
    When User enters sign up info
      | FirstName   | LastName   | Email   | Phone   |
      | <FirstName> | <LastName> | <Email> | <Phone> |
    Then Home Page is displayed

    Examples: 
      | FirstName | LastName | Email                     | Phone     |
      | Priyanka  | Kanodia  | priyanka.knodia@gmail.com | 123456789 |
      | Rishi     | Agarwal  | rishi.dulles@gmail.com    | 987654321 |
