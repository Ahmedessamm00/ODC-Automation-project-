@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given navigate to url website
    And click on register page
    And enter first name and last name
    And enter email field
    And enter Password field
    And enter Confirmed password
    And clicks on register button
    Then success message
