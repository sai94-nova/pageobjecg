package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redifflogin {
	WebDriver driver;
	public redifflogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	@FindBy(name="proceed")
	WebElement go;
	
   
   
   public WebElement Emaild()
   {
	   return username;
   }
         
   public WebElement Password()
   {
	   return Password;
   }
   
  
   public WebElement Home()
   {
	   return home;
   }
}
