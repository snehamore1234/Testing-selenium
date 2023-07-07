Feature: Amazon buy product

  Background: 
    Given User has already logged in to application
      | username   | password  |
      | 9657578335 | Sneha@123 |

  Scenario: Buy product test cases
    Given user is on amazon home page
    When user select a search option as all
    And user click on serach bar and enter product name
    Then user enter a button
    And Scroll the window to get show more product
    And user click filter which Brand is one plus
    And user click on one product
    Then user redirect to page that title should be "Amazon.in : one plus 8pro"
    And user click on buy button
    Then user return back to the Home page window
