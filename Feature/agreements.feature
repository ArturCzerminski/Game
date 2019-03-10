Feature: Agreement
  This feature is aimed to set agreement to start the app
  Scenario: Setting up agreements
    Given I open the app
    When I tap on the accept button on the private policy pop up
    When I tap on the accept button on the advertisement pop up
    Then I see that a tutorial screen is displayed
