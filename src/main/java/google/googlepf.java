package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlepf {
	WebDriver driver;
	public googlepf(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Search']")
	WebElement srch;
	
	@FindBy(xpath="//div[@class='VlcLAe']//input[@value='Google Search']")
	WebElement srchtbn;
	
	public WebElement Search() {
		return srch;
		
	}
	
	public WebElement SearchBtn() {
		return srch;
		
	}
}
