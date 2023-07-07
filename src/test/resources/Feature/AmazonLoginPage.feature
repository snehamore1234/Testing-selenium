Feature: Login page Amazon

  Scenario Outline: Login Details
    Given User is on AmazonLogin page
    When user click on Accoun Sign in Text
    And user pass mobile number in to text field "<username>"
    And user click on continue button
    And user pass password in text field "<password>"
    And user click on sign in button
    Then user is login to Amazon Account that page contains text which is "Hello, Sneha"

    Examples: 
      | username   | password  |
      | 9657578335 | Sneha@123 |
