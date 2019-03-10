Feature: Field change checking
  This feature checks if tapping on the different fields causes change

  Scenario: Changing field
    Given I am on the game screen
    When I tap on the field on the game board
    And I tap on the different field on the game board
    Then I see that the field is changing