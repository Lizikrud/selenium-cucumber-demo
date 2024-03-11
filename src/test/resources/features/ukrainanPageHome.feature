Feature: Home Page and Creating Account

@smoke @run
  Scenario: Landing on homepage and validate Welcome to Ukrainian Pages
   Given User should be landing on homepage Ukrainian Pages
   Then User should see "Welcome to Ukranian Pages"

#@smoke
  Scenario:  User should be able make a Purchase from Home Page clicking on the buttom
    Given User should be landing on homepage Ukrainian Pages
    Then User should see Make a Purchase button
    Then User should click to Make a Purchase button
    Then User should be transfer to Catalog Page

#  @smoke
  Scenario: Create account on Login Page
    Given User should be landing on homepage Ukrainian Pages
    Then User should click on human icon and being transfer to Login Page
    Then User should to click on Create Account and transfer to Create Account Page
    Then User should be able to see fields and fill it out all fields
    Then User Should be able to create account and landing to Account Page



