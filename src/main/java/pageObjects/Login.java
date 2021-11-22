package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public WebDriver driver; 
	By User=By.xpath("//*[@type='text']");
	By Pass =By.xpath("//*[@type='password']");
    By Submit =By.xpath("//button[@type='submit']"); 
    
    
    By Cuopen =By.xpath("//*[@id=\"customer\"]/a"); 
    By Cemail = By.cssSelector("#input-email");
    By Cname=By.xpath("//*[@type=\"text\"]");
    By Capp=By.xpath(" //*[@name='filter_approved']");
    By Cgroup=By.xpath(" //*[@name='filter_customer_group_id']");
    By Cstatus=By.xpath("//*[@name='filter_status']");
    By Cip=By.xpath("//*[@id=\"input-ip\"]");
    By Cdate=By.xpath("//*[@class='fa fa-indent fa-lg']");
    By Cfilter=By.xpath(" //*[@id='button-filter']");
  
    By Cgrp= By.xpath("//*[@id=\"customer\"]/ul/li[2]/a");
    By Cgplus= By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
    By Cgname= By.xpath("//*[@name='customer_group_description[1][name]']");
    By Csave=By.xpath("//*[@id='container']");
    By Ccancel=By.xpath("//*[@class='fa fa-reply']");
    By Cfields=By.xpath("//*[@id=\"customer\"]/ul/li[3]/a");
    By Cfadd=By.xpath("//*[@data-original-title=\"Add New\"]");
    By Cfname=By.xpath("//*[@name='custom_field_description[1][name]']");
    By Cfcancel=By.xpath("//*[@data-original-title='Cancel']");
    
    

    
  
    
    
     public Login(WebDriver driver) {
    	 this.driver=driver;
    	 
     }
     public WebElement getUser()
     {
    	 return driver.findElement(User);
    	 
     }
     public WebElement getPass()
     {
    	 return driver.findElement(Pass);
    	 
     }
     public WebElement getSubmit()
     {
    	 return driver.findElement(Submit);
    	 
     }


   
     public WebElement getCuopen() 
		{
			
	    return driver.findElement(Cuopen);
	 
    }
     public WebElement getCemail() 
		{
			
	    return driver.findElement(Cemail);
	 
}

     
     public WebElement getCname()
		{
			
	    return driver.findElement(Cname);
	 

	 
}
     public WebElement getCapp()
		{
			
	    return driver.findElement(Capp);
		}
	 
        public WebElement getCgroup()
		{
			
	    return driver.findElement(Cgroup);
		}
        public WebElement getCstatus()
		{
			
	    return driver.findElement(Cstatus);
		}
        public WebElement getCip()
		{
			
	    return driver.findElement(Cip);
		}
        

        public WebElement getCfilter()
		{
			
	    return driver.findElement(Cfilter);
		}

       public WebElement getCgrp()
		{
			
	    return driver.findElement(Cgrp);
		}
       public WebElement getCgplus()
		{
			
	    return driver.findElement(Cgplus);
		}
        public WebElement getCgname()
		{
			
	    return driver.findElement(Cgname);
		}
        public WebElement getCsave()
		{
			
	    return driver.findElement(Csave);
		}
        public WebElement getCcancel()
		{
			
	    return driver.findElement(Ccancel);
		}
        public WebElement getCfields()
      		{
      			
      	    return driver.findElement(Cfields);
      		}
        public WebElement getCfadd()
  		{
  			
  	    return driver.findElement(Cfadd);
  		}
        public WebElement getCfname()
  		{
  			
  	    return driver.findElement(Cfname);
  		}
        public WebElement getCfcancel()
  		{
  			
  	    return driver.findElement(Cfcancel);
  		}







}
