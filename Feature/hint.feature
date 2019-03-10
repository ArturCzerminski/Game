Feature: Getting hint
  This feature allows user to get a hint during the game

  Scenario: Getting a hint
    Given I am on the game screen
    When I tap on the hint button
    And I observe the game screen
    Then I see that a hint is displayed on the board