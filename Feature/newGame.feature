Feature: newGame
  This feature sets up a new Sudoku game

  Scenario: Setting up easy mode game
    Given I am on the game screen
    When I tap on the newGame button
    And I tap on the easyModeGame button
    Then I see that a new game is set up
    And I see that a new game board is displayed