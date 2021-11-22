Feature: Customers
 @Admin
  Scenario: verify admins pageis opening when clicking on login
    Given login with credentials
    When click on login
    Then navigate to admin page
  
    When click on Customers option
    Then Customers  page is opened
    And enter customer details
   
    When click on Customers option
    Then Customers Group  page is opened
    And enter customer Group details
   
 
    When click on Customers option
    Then Custom fields  page is opened
    And enter Custom Fields
