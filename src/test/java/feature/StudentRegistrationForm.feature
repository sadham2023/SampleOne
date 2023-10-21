Feature: Fill the Student Registration

  Scenario: Enter the student details
    Given Launch the Browser
    And Enter the URL
    When Enter the first name "Sadham"
    And Enter the last name "Hussain"
    And Enter the Email "02sadham@gmail.com"
    And Choose gender "Male"
    And Enter mobile number "9585219465"
    And Enter date of birth "05/27/1992"
    And Enter subjects "Maths, Science"
    And Select the Sports
    And upload the picture
    And Enter the current address "Coimbatore"
    Then validate the details are saved