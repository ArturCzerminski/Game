Feature: Notes creating
  This feature allows user to create notes during a game
  Scenario: Creating a note on the board field
    Given I am on the game screen
    When I tap on the notes button
    And I tap on the field on the game board
    And I tap on the 2 random digits from 1 to 9
    Then I see that a note is created inside a single field on the board