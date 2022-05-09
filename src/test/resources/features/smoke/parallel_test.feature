Feature: Parallel testing demo

@datadriven_example
Scenario Outline: Add specific products based on product name
Given I login as "standard" user
Then  I add a "<product_name>" to the cart
Then I should see 1 "<product_name>" in the cart
Examples:
| product_name         |
|Sauce Labs Backpack   |
|Sauce Labs Bike Light |
