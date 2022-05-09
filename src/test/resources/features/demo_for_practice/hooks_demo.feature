Feature: test hooks

  Background:
    Given my account balance is £100
    When I withdraw £10

  @regression @smoke
  Scenario: Dummy scenario 1
    When the account balance should be £90
    And I withdraw £20
    Then the account balance should be £70

  Scenario: Dummy scenario 2
    Then the account balance should be £900

  Scenario: Dummy scenario 3
    Then I added £40
    Then the account balance should be £220

  Scenario: Dummy scenario 4
    Then I added £40
    Then the account balance should be £220
    And I go for shopping
    Then I go home
