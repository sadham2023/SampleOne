Feature: LoginPage for Facebook

  Background: 
    Given Launch the Browser
    And Enter the URL
  Scenario: Enter the valid username and password
    When Enter the username "Sadham"
    And Enter the password "Test@123"
    And Enter the loginbutton
    Then Validate the HomePage