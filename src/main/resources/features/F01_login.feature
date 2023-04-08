@smoke
  Feature: Login_ user could login to the system with valid account
    Scenario: valid login
      Given navigate to url website
      And go to login page
      When enter valid email and password
      And click on login button
      Then verify that user logged in successfully

    Scenario: invalid login
      Given navigate to url website
      And go to login page
      When enter invalid email and password
      And click on login button
      Then verify that user didn't logged in successfully

    Scenario: empty login
      Given navigate to url website
      And go to login page
      When Don't enter email and password
      And click on login button
      Then Unsuccessfully login
