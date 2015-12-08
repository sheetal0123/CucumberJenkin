@yahoo
Feature: Yahoo Search Results
  In order to test Yahoo search results
  As a user
  I want to verify search results count

  Scenario Outline: Yahoo SRP
    Given user is on application home page
    When user search for "<Keyword>"
    Then user verify results
    And user close the application

    Examples: 
      | Keyword        |
      | seleniumhq org |
