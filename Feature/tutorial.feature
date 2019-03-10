Feature: Skipping the Tutorial
  This feature shows how to skip the tutorial
  Scenario: Skipping the tutorial view
    Given I am on the tutorial screen
    When I tap on the skip button
    Then I see that a new game screen is displayed