Feature: Add to cart

  @first_tc
  Scenario: Add one product to cart
    Given I login as "standard" user
    Then  I add a "backpack" to the cart
    Then I should see 1 "backpack" in the cart

  @first_tc @parallel
  Scenario: Add one product to cart -paralle1
    Given I login as "standard" user
    Then  I add a "phone" to the cart
    Then I should see 2 "backpack" in the cart
