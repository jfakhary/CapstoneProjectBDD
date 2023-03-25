@CompleteTest
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

	@smokeTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'jim@gmail.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

 	@smokeTest
  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email              | password |
      | habibjan@gmail.com | Tek@1234 |
      | jim@gmail.com      | Tek@12345|
	@smokeTest
  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email         | password  | confirmPassword |
      | Samad | samad@tek.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
