@regression
Feature: User login process

  Background: Preliminary Steps
    Given user navigates to Ukrainian Pages


  @loginValid @smoke
  Scenario: Login with valid credentials
    When user logs in with username "yulliaroberts123@gmail.com" and password "yr123456789"
    When user clicks login button
    Then user is redirected to account page


#  @examplesTable
#    Scenario Outline: Login with invalid credentials <test_point>
#      When user logs in with username "<username>" and password "<password>"
#      Then user can see error message "<errorMessage>"
#      * framework browser quit
#
#      Examples:
#        | test_point          | username | password | errorMessage                |
#        | when both invalid   | invalid  | invalid  | Incorrect email or password |
#        | when username empty |          | invalid  | Incorrect email or password |
#        | when password empty | invalid  |          | Incorrect email or password |
