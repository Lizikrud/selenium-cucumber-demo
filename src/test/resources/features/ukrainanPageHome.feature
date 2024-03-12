Feature: Home Page and Creating Account

  Background: Preliminary Steps
    Given User should be landing on homepage Ukrainian Pages
@smoke
    Scenario: Landing on homepage and validate Welcome to Ukrainian Pages
    Then User should see "Welcome to Ukrainian Pages"


 #@smoke
    Scenario: Validate Tittle
    And Validate the Tittle



#  @smoke
  Scenario: Create account on Login Page
    Given User should be landing on homepage Ukrainian Pages
    Then User should click on human icon and being transfer to Login Page
    Then User should to click on Create Account and transfer to Create Account Page
    Then User should be able to see fields and fill it out all fields
    Then User Should be able to create account and landing to Account Page



