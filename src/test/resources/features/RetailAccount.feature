@CompleteTest
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'jim@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
	
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Farid ahmad' and Phone '5712265889'
    And User click on Update button
    Then User profile information should be updated
 	
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4325987465328832 | Jim Smith  |               4 |           2026 |          491 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’ 
	
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on card information
    And User click on remove option of card section
    Then payment details should be removed  
	
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt | city   | state    | zipCode |
      | United States | Jim John | 703-256-4585 | 14 Lorton Rd  | 789 | Lorton | Virginia |   22079 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’ 
	
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on card information
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4325987465329342 | Jim Smith  |               6 |           2028 |          089 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’  
	
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United States   | Samad Ali    | 7032563526       | 1256 Centreville Rd         | 14 | Fairfax | Virginia | 22152   |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’ 
	
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
    
    Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | "Tek@12345"      | "Tek@1234"  | "Tek@1234"      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’
