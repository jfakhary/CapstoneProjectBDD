Feature: This feature is use for testing UI of Retail page
	
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |
	
  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |
	
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'jim@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’  
	
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'jim@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName    | phoneNumber  | streetAddress     | apt | city        | state    | zipCode |
      | United States | Mark Heaven | 703-943-8833 | 1876 Armstrong Rd |   41 | Springfield | Virginia |   22153 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 1234234534564567 | Mark Heaven |               6 |           2028 |          456 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’  

  
  Scenario: Verify User can place an order with Shipping address and payment Method on file    
    Given User is on retail website    
    When User click on Sign in option    
    And User enter email 'jim@gmail.com' and password 'Tek@12345'    
    And User click on login button    
    And User should be logged in into Account    
    And User change the category to 'Electronics'    
    And User search for an item 'Apex Legends '    
    And User click on Search icon    
    And User click on item    
    And User select quantity ‘5’    
    And User click add to Cart button    
    Then the cart icon quantity should change to ‘5’  
    And User click on Cart option    
    And User click on Proceed to Checkout button    
    And User click on Place Your Order    
    Then a message should be displayed ‘Order Placed, Thanks’
