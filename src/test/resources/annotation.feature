Feature: Annotation

  Background:
    User navigates to MainPage
    Given I am on login MainPage

  #Scenario with AND
  Scenario:
    When I enter username as "TOM"
    And  I enter password as "JERRY"
    Then Login should fail

  #Scenario with BUT
  Scenario:
    When I enter username as "TOM"
    And  I enter password as "JERRY"
    Then Login should fail
    But  Relogin option should be available