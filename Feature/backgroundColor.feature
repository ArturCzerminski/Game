Feature: backgroundColor
  This feature is changing background color of the app

  Scenario: Changing background color of the app
    Given I am on the game view
    When I tap on the color pallete icon
    And I tap on black picker
    And I tap on the ok button
    Then I see that background color of the app is changed to black