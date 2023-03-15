Feature: Home page tests



  @US-01 @regression
  Scenario: US1021 -Tests header
    Given I open url to homepage
    When I click in close
    When I verify the table header is displayed

  @US-02
