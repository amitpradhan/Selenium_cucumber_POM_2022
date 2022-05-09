Feature: test feature

  @basic
  Scenario: Dummy scenario
    Given my account balance is £100
    When I withdraw £10
    Then the account balance should be £90

