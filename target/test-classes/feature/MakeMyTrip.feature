Feature: Book a flight in makemytrip

  Scenario: Enter the location details
    Given Launch the Browser
    And Enter the URL
    When Enter the From location "Coimbatore"
    And Enter the To locaion "Chennai"
    And Select the departure date
    And Select the Return date
    And Select the travellers and class
    And Enter the search button
    Then Validate the Results
    When Select the Cheapest option
    And Select view prices
    And Enter the book now button
    And Validate redirected to booking page
    When Click on add new adult
    And Enter first name "Sadham"
    And Enter last name "Hussain"
    And Choose Gender "Male"
    And Choose Date of Birth
    And Enter the mobile num "9585219465"
    And Enter the mail id "02sadham@gmail.com"
    And Select No for trip secure
    And Enter the pincode "641016"
    And Enter the State "Tamil Nadu"
    And Select confirm and save billing detaills
    And click continue button
    Then Validate confirmation pop up appeared
    And click continue button
    And Select the required seat
    And click continue button
    And click proceed to pay
    When Select the payment options
    And Choose Credit crad tab
    And Enter the Card Number "43546575676877"
    And Ener the name on card "Sadham Hussain J"
    And Ener the Expiry month and year
    And Enter the cvv
    And Enter the country
    And Enter the State
    And Enter Billing address
    And Enter city name
    And Enter Pin code
    And Click the Save Card and pay
    Then validate the booked flight details
