package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

      public class Dashboard 
      {
	    public WebDriver driver; 
		By User=By.xpath("//*[@type='text']");
		By Pass =By.xpath("//*[@type='password']");
	    By Submit =By.xpath("//button[@type='submit']"); 
	   
	    By Oview =By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[1]/div/div[3]/a");
	    By Oid=By.xpath("//*[@id=\"input-order-id\"]");
	    By Ostatus=By.xpath("//*[@name='filter_order_status']");
	    By Oname=By.xpath("//*[@name='filter_customer']");
	    By Ofilter=By.xpath("//*[@id='button-filter']");
	    By Odashboard=By.xpath("//*[@class='fa fa-dashboard fa-fw']");
	    
	    By Cview=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[3]/div/div[3]/a");
	  
	    By Online=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[4]/div/div[3]/a");
	    By Ip=By.xpath("//*[@name='filter_ip']");
	    By Customer=By.xpath("//*[@name='filter_customer']");
	    By Filter=By.xpath("//*[@id='button-filter']");
	    
	    By Mapin=By.xpath("//*[@id=\"vmap\"]");
	    By Mapout=By.xpath("//*[@id=\"vmap\"]");
	    
	    By Sales=By.xpath("//*[@class='caret']");
		   
	   
	   
	   
	   public Dashboard(WebDriver driver) {
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
     public WebElement getOview()
     {
	 return driver.findElement(Oview);
	 
      }
     public WebElement getOid()
     {
	 return driver.findElement(Oid);
	 
      }
     public WebElement getOstatus()
     {
	 return driver.findElement(Ostatus);
	 
      }
     public WebElement getOname()
     {
	 return driver.findElement(Oname);
	 
      }
     public WebElement getOfilter()
     {
	 return driver.findElement(Ofilter);
	 
      }
     public WebElement getOdashboard()
     {
	 return driver.findElement(Odashboard);
	 
      }
     public WebElement getCview()
     {
	 return driver.findElement(Cview);
	 
      }
     public WebElement getOnline()
     {
	 return driver.findElement(Online);
	 
      }
     public WebElement getIp()
     {
	 return driver.findElement(Ip);
	 
      }
     public WebElement getCustomer()
     {
	 return driver.findElement(Customer);
	 
      }
     public WebElement getFilter()
     {
	 return driver.findElement(Filter);
	 
      }
     public WebElement getMapout()
     {
	 return driver.findElement(Mapout);
	 
      }
     public WebElement getMapin()
     {
	 return driver.findElement(Mapin);
	 
      }
     public WebElement getSales()
     {
	 return driver.findElement(Sales);
	 
      }
}