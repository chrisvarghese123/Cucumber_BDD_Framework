@triggerAudio
@trigger
Feature: Test the Login Functionality of Rezolve

  Scenario: Test the Login functionality
    Given user is on the Home page
    And click the Login button
    When user enters valid credentials
    Then user is successfully logged in
    When user clicks Trigger option
    Then user is displayed the Create An Engagement page
    And  user clicks Audio Button
    And user upload the audio file for audio trigger
    #And Close the browser

