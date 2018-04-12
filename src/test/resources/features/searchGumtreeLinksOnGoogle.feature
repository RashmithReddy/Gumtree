@wip
Feature:
  As a user
  I would like to do a search on google for the cars in london
  So that i can determine how many Gumtree links are available from the search results

  Scenario: Search for cars in london on google and see how many gumtree links are available from the search results
    Given I am on Google
    When I search for cars in london
    Then I should see a list of results
    And I select each Gumtree link from the list to validate that each link has a minimum of 1 advert
