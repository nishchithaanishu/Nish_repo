package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WElcomePage {
	
	public WElcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Register")
	public WebElement registerlink;
	
	@FindBy(linkText="Log in")
	public WebElement loginlink;
}
