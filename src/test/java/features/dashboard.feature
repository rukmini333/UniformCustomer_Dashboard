Feature: Dashboard

  @Orders
  Scenario: verify Orders functionlity in dashboard
    Given  login with credentials
    When click on login
    Then navigate to admin page
   
    When Clicking on view orders in orders and sales icon
    Then Orders page is opened
   
   @Customers
  Scenario: verify Customers functionlity in dashboard
    Given  login with credentials
    When click on login
    Then navigate to admin page
   
    When clicked on viewmore in Total customers  
    Then navigated  page
    
 @Online
  Scenario: verify Customers functionlity in dashboard 
    Given  login with credentials
    When click on login  
    Then navigate to admin page
   
    When clicked on viewmore in people  Online
    Then navigated  to people online page         
    
  @Dashboard
  Scenario: verify Customers functionlity in dashboard 
    Given  login with credentials
    When click on login  
    Then navigate to admin page
   
    When verify World map and Sales analytics options
    Then stay back on Dashboard page            
          
    
    