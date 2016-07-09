Feature: New user registration

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
    Then Login should be successful