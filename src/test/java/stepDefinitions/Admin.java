package stepDefinitions;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.Dashboard;
import pageObjects.Login;
import resources.Base;

public class Admin extends Base {
	
	@Given("login with credentials")
	public void login_with_credentials() throws IOException {
		
		//initializing the driver
		driver=initializeDriver();
		 String s=" http://uniformm1.upskills.in/admin/index.php?route=common/login";
		 driver.get(s);
		 
		 Login l=new Login(driver);
		 
		 //passing credentials for login
		 l.getUser().sendKeys("admin");
		 l.getPass().sendKeys("admin@123");
		 
		 
		   
	}
     
	   @When("click on login")
	    public void click_on_login() {
		Login l=new Login(driver);
		//to submit the credentials
		 l.getSubmit().click();

	}     

	@Then("navigate to admin page")
	public void navigate_to_admin_page() {
		//to navigate to dashboard page
		String msg= driver.findElement(By.xpath("//*[text()='Dashboard']")).getText();
		System.out.println("navigated to admin page");
	}
	
		@When("click on Customers option")
	public void click_on_customers_option() {
		
		Login l1=new Login(driver);
		 //To open the dropdown of customers
		 l1.getCuopen().click();
		System.out.println("customer dropdown is opened");
	}
		

		    @Then("^Customers  page is opened$")
		    public void customers_page_is_opened() throws Throwable {
		     //To open customer page	
			 driver.findElement(By.xpath("//*[@id=\"customer\"]/ul/li[1]/a")).click();
		   
			 System.out.println("customer page is opened");
			
		    }
		    @And("enter customer details")
		    public void enter_customer_details() {
		     Login l2=new Login(driver);
			 //To place cursor on email text box
		     l2.getCemail().click();
			 l2.getCemail().sendKeys("rukmini.ganesana@gmail.com");
			 
			//To place cursor on name text box
			 l2.getCname().click();
			 l2.getCname().sendKeys("rukmini");
			 
			 //To place cursor on approved text box
			 l2.getCapp().click();
		     WebElement Approved = l2.getCapp();
			
		     //To select the value from the approved dropdown
		     Select dropdown = new Select(Approved);
			 dropdown.selectByVisibleText("Yes");
			 
			 l2.getCapp().click();
			 WebElement CustomerGroup = l2.getCgroup();
			//To select the value from the CustomerGroup dropdown1
			 Select dropdown1 = new Select(CustomerGroup);
			 dropdown1.selectByVisibleText("Guest");
			   
			 l2.getCstatus().click();
			 WebElement Status = l2.getCstatus();
			 Select dropdown2 = new Select(Status);
			 dropdown2.selectByVisibleText("Enabled");
			 
			 l2.getCip().click();
			 //To send data to IPtextbox
			 l2.getCip().sendKeys("152.168.4.101");
			 
			 //To filter with the given data
			 l2.getCfilter().click();
			 
			 driver.findElement(By.xpath("//*[@id=\"button-menu\"]/i")).click();
			 
			 driver.findElement(By.xpath("//*[@id=\"customer\"]/a")).click();
			   
		 }		 
			 //to open customer Group page
			 @Then("Customers Group  page is opened")
			 public void customers_group_page_is_opened()
			 {
				 
				 Login l3=new Login(driver);
		          System.out.println("customer dropdown2 is opened");
			    
		          l3.getCgrp().click();
			     System.out.println("Customer Group page is opened");
			 }

			 @And("enter customer Group details")
			 public void enter_customer_group_details()
			 {
				 Login l4=new Login(driver);
				 
				 System.out.println("edit is opened");
			 
				 //To add data by clicking plus icon
				 l4.getCgplus().click();
				 l4.getCgname().click();
				 l4.getCname().sendKeys("Basic");
				 
				 //To save the added data
				 l4.getCsave().click();
				 System.out.println("clicked");
				 
				  
				 driver.findElement(By.xpath("//*[@type='button']")).click();
				 System.out.println("click");
				 
				 
				 //To navigate back to customer page
				 l4.getCuopen().click();
				 System.out.println("closed");
				
				
			 }
			 @Then("Custom fields  page is opened")
			 public void custom_fields_page_is_opened() {
				 
				 Login l5=new Login(driver);
				 
				 //To open Custom fields page
				  l5.getCfields().click();
		          System.out.println("custom field is opened");
			    
				 
			     
			 }

			 @Then("enter Custom Fields")
			 public void enter_custom_fields() {
				 Login l6=new Login(driver);
				 System.out.println("custom driver started is opened");
				 
				    
				 //To add data in custom fields
				 l6.getCfadd().click();
				 System.out.println("custom save is opened");
				 l6.getCfname().click();
				 //To place data in name Text box
				 l6.getCname().sendKeys("Basic");
				 
				   l6.getCfcancel().click();
			 }
				   
			      //Dashboard
				 
				    @When("Clicking on view orders in orders and sales icon")
				   public void clicking_on_view_orders_in_orders_and_sales_icon() {
					   
					 Dashboard l7=new Dashboard(driver);
					 //To click on View more at orders icon
					 l7.getOview().click();
					 System.out.println("navigated to order page ");
						 
				      
				   }

				      @Then("Orders page is opened")
				      public void orders_page_is_opened() {
					   
					   Dashboard l8=new Dashboard(driver);
					   System.out.println("data");
					   
						l8.getOid().click();
						//To send data into text box
						l8.getOid().sendKeys("333");
						System.out.println("data in order page");
						
					   	l8.getOstatus().click();
					     WebElement Orderstatus = l8.getOstatus();
					     //To select the option from status dropdown
						 Select dropdown = new Select(Orderstatus);
						 dropdown.selectByVisibleText("Pending");
						
						  l8.getOname().click();
						  l8.getOname().sendKeys("rukmini");
						  
						  l8.getOfilter().click();
						  System.out.println("filter applied");
						  
						  //To navigate back to home page
						  l8.getOdashboard().click();
						  System.out.println("clicked on dashboard");
				   }  
						  
						  @When("clicked on viewmore in Total customers")
						  public void clicked_on_viewmore_in_total_customers() {
							  
		                 Dashboard l9=new Dashboard(driver);
		     			//To click on view more on Customers  icon
						 l9.getCview().click();
								   
					     System.out.println("navigated to customer page page ");
									 
						     
						  }

						  @Then("navigated  page")
						  public void navigated_page() {
							  Dashboard l10=new Dashboard(driver);
							  
							  l10.getOdashboard().click();
						  }
						 


                   @When("clicked on viewmore in people  Online")
                   public void clicked_on_viewmore_in_people_online() {
                	   Dashboard l11=new Dashboard(driver);
           			//To click on view more on Customers online icon
						  l11.getOnline().click();
                	   
                   }

                   @Then("navigated  to people online page")
                   public void navigated_to_people_online_page() {
                	   
                	   Dashboard l12=new Dashboard(driver);
						  
						  l12.getIp().click();
						  //To place data in IP box
						  l12.getIp().sendKeys("192.168.4.101");
						  
						  
						  l12.getCustomer().click();
						  //To place data in name text box
						  l12.getCustomer().sendKeys("Team");
						  
                          //To filter the given data
						  l12.getFilter().click();
						 }

                 @When("verify World map and Sales analytics options")
                     public void verify_world_map_and_sales_analytics_options() {
                	 

             		  Dashboard d1=new Dashboard(driver);
             		  //To map in the area
             		  d1.getMapin().click();
             		 //To map out the area
             		  d1.getMapout().click();
             		 //To click on sales 
             		 d1.getSales().click();
             		
					
             		  
          }

                  @Then("stay back on Dashboard page")
                  public void stay_back_on_dashboard_page() {
                	  Dashboard d4=new Dashboard(driver);
					  
					  d4.getOdashboard().click();
                  }
                  
    

						  
  
						  
						   
						      
				 
			 
			 




          
}

				 
				 
			
				 
				   
				 
				   

			 
		 
			   
			   
 			 
		 
	

	


	
	


	