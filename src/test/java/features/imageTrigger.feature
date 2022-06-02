@triggerImage
@trigger
Feature: Test the Login Functionality of Rezolve

  Scenario: Test the Login functionality
    Given user is on the Home page
    And click the Login button
    When user enters valid credentials
    Then user is successfully logged in
    When user clicks Trigger option
    Then user is displayed the Create An Engagement page
    And  user clicks Image Button
    Then upload the image
    When the user clicks on the target page button
    And selects Buy option
    And creates a new buy target
    Then confirm and publish the changes
    And the user completes the payment information required
    And selects the pay button
    #And Close the browser

