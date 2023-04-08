@smoke
  Feature: Change The Currency From Dollar To Euro
   Scenario: change currency
     Given navigate to url website
     And go to login page
     When enter valid email and password
     And click on login button
     Given navigate to url website
     And click on customer currency
     And choose euro currency




