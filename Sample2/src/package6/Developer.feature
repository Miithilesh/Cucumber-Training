
Feature: Life of a IT Guy

  
@Sanity @smoke
  Scenario Outline: 
    Given I am a "<Developer>"
    When I fix "<Defects>"
    Then I get appreciated by "<Manager>"

  Examples:
    |Developer|Defects|Manager|
    |Sridevi|great|Shang|
    