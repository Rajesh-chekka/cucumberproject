
Feature: Test the login functionality of OrangeHRM

// @tags= {"@FunctionalTest and @SmokeTest"}
 
   Scenario Outline: Test the valid login
    Given user is on loginPage
    When user enters <username> and <password>
    And click on login button
    Then user should land on home page

    Examples: 
      | username | password  |
      | rajesh656456@gmail.com | Rajesh6837@ |
      | 9059846459@gmail.com   | Nikesh@1739 |
     
