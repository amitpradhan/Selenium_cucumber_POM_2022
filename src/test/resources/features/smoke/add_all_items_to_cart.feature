Feature: Add to cart

  @add_all_items @parallel
  Scenario: Add one product to cart -paralle3
    Given I login as "standard" user
    Then  I add a "Sauce Labs Backpack " to the cart
    Then  I add a "Sauce Labs Bike Light" to the cart
    Then  I add a "Sauce Labs Bolt T-Shirt " to the cart
    Then  I add a "Sauce Labs Fleece Jacket" to the cart
    Then  I add a "Sauce Labs Onesie " to the cart
    Then  I add a "Test.allTheThings() T-Shirt (Red)" to the cart
    Then  I should see all the items in the cart



  @add_all_items_datadriven @parallel
  Scenario: Add all product to cart - paralle2
    Given I login as "standard" user
    Then  I add a "Sauce Labs Backpack " to the cart
    Then  I add a "Sauce Labs Bike Light" to the cart
    Then  I add a "Sauce Labs Bolt T-Shirt " to the cart
    Then  I add a "Sauce Labs Fleece Jacket" to the cart
    Then  I add a "Sauce Labs Onesie " to the cart
    Then  I add a "Test.allTheThings() T-Shirt (Red)" to the cart
    Then  I should see all the items in the cart with below data
     |Sauce Labs Backpack  |Sauce Labs Bike Light  |Sauce Labs Bolt T-Shirt    |Sauce Labs Fleece Jacket |Sauce Labs Onesie  |Test.allTheThings() T-Shirt (Red)  |

#    @datadriven_example
# Scenario Outline: Add specific products based on product name
#   Given I login as "standard" user
#   Then  I add a "<product_name>" to the cart
#   Then I should see 1 "<product_name>" in the cart
#   Examples:
#     | product_name         |
#     |Sauce Labs Backpack   |
#     |Sauce Labs Bike Light |



