Feature: As a user
  I would like to use the age calculator app
  So that i know my correct age

  Background:
    Given I am on the Age calculator application

  Scenario: Valid date of birth
    When I enter my date of birth as 01/01/1990
    And click on the Calculate my age button
    Then I should see the message Your current age is 28 years

  Scenario Outline: Boundary value test for the date field
    When I enter my date of birth as <dob>
    And click on the Calculate my age button
    Then I should see the message <message>

    Examples:
      | dob        | message                               |
      | 13/04/2018 | Date of birth cannot be in the future |
      | 12/04/2018 | Your current age is 0 years           |
      | 31/12/1899 | Please enter a date after 01/01/1900  |
      | 01/01/1900 | Your current age is 118 years         |

  Scenario Outline: Error scenarios for the date field
    When I enter my date of birth as <dob>
    And click on the Calculate my age button
    Then I should see the error message <errorMessage>

    Examples:
      | dob        | errorMessage                             |
      |            | Please enter a date of birth             |
      | 1990/01/01 | Please enter a date in dd/mm/yyyy format |
      | 12/31/2001 | Please enter a date in dd/mm/yyyy format |
      | 01-01-2001 | Please enter a date in dd/mm/yyyy format |


