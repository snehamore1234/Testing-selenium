Feature: Useing Dynamic way to search of product

  Scenario: Launch the flipkart website    
    Given user is on flipkart website page
    When user enter product name in search bar 
    And user get the suggestion of product list size and name
    Then select the product name through suggested list

