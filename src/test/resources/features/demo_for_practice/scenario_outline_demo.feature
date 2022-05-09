Feature: test scenario outline

#  Scenario: Dummy scenario 1
#    Given my account balance is £100
#    When I withdraw £10
#    Then the account balance should be £90
#
#  Scenario: Dummy scenario 2
#    Given my account balance is £1000
#    When I withdraw £100
#    Then the account balance should be £900
#
#  Scenario: Dummy scenario 3
#    Given my account balance is £200
#    When I withdraw £20
#    Then the account balance should be £180

  Scenario Outline: dummy scenarios
    Given my account balance is £<opening balance>
    When I withdraw £<withdrawl amount>
    Then the account balance should be £<closing balance>

    @prod
    Examples:
      |opening balance  |withdrawl amount |closing balance|
      |1000             |100              |900            |
      |200              |20               |180            |
      |100              |90               |10             |

    @uat
    Examples:
      |opening balance  |withdrawl amount |closing balance|
      |4000             |500              |600            |
      |400              |50               |680            |
      |400              |50               |60             |

