Feature: Scenario Outline Test

  Scenario Outline: Negative Login
    Given User navigates to some login Page
    When User enters username as "<username>"
    And User enters password as "<password>"
    Then Login should be failed

    Examples:
    | username | password  |
    | user1    | pass1     |
    | user2    | pass2     |


  @SmokeTest
  Scenario: Basic Login
    Given User navigates to some login Page
    When User enters username as "admin"
    And User enters password as "admin"
    Then Login should be successful

  @LoginForm
  Scenario: User registration
    Given User navigates to some login Page
    When User enters invalid data on page
      | Fields      | Values          |
      | First Name  | Tom             |
      | Last Name   | Kenny           |
      | EmailAddress| some@gmail.com  |
      | Re-enter email address | some@gmail.com  |
      | Password    | pswd1           |
      | BD          | 05              |
    Then Login should be failed