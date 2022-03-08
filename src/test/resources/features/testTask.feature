Feature: Test task feature

  Scenario: check main page title
    When user opens "https://edlus.lmt.lv/"
    Then page title is "LMT elektroniskā darbalaika uzskaite – EDLUS"

  Scenario: click on "Funkcijas" hyperlink and navigate back
    Given user opens "https://edlus.lmt.lv/"
    When user clicks on "Funkcijas" hyperlink in menu
    Then page title is "Funkcijas"
    When user navigates back
    Then he is on the main page
    And page title is "LMT elektroniskā darbalaika uzskaite – EDLUS"

  Scenario: Check “Pieteikties konsultācijai” button visibility on main page
    Given user opens "https://edlus.lmt.lv/"
    Then “Pieteikties konsultācijai” button is visible

  Scenario Outline: Fill in application information
    Given user opens "https://edlus.lmt.lv/"
    When user clicks on "Kas ir EDLUS" hyperlink in menu
    And user clicks apply to consultation
    And user fills in all information: <companyTitle>, <name>, <surname>, <phoneNumber>, <email>, <comment>
    And close current window
    Examples:
      | companyTitle | name      | surname      | phoneNumber | email           | comment     |
      | company      | my name   | my surname   | 123456      | me@example.com  | my comment  |
      | company2     | my name 2 | my surname 2 | 123456789   | me@example2.com | my comment2 |

#  to-do: submit info & check if received
# to-do: check that invalid info cannot be submitted

