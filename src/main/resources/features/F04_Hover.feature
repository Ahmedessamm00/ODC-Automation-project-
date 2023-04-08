@smoke
Feature:user hover on categories

  Scenario: User can hoover on different subcategories
    Given navigate to url website
    And go to login page
    When enter valid email and password
    And click on login button
    When user select random one of the three main categories
    And user clicks on items from subcategories
    Then user could hover on sub categories of the selected main category