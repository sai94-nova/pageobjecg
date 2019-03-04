package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffhome {
	WebDriver driver;

	public rediffhome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "srchword")
	WebElement search;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	@FindBy(linkText = "Home")
	WebElement home;

	@FindBy(name = "proceed")
	WebElement go;

	public WebElement Search() {
		return search;
	}

	public WebElement Submit() {
		return submit;
	}

	public WebElement Home() {
		return home;
	}
}
