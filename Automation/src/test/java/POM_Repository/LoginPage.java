package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement emailTextField;
	
	@FindBy(name="Password")
	public WebElement PasswordTextField;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginButton;

}
