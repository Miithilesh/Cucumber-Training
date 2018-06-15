
Feature: Test Calculator
  Scenario: Add two numbers
    Given I Enter 30 in the calculator
    And I press Add    
    When I have entered 50 in the calculator
    And I press equal symbol
   	Then click Ok symbol