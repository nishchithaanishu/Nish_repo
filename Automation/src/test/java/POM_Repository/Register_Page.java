package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	public void Register_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	public WebElement RigisterLink;
	
	@FindBy(id="gender-female")
	public WebElement genderButton;
	
	@FindBy(id="FirstName")
	public WebElement FirstNameTestField;
	
	@FindBy(id="LastName")
	public WebElement LastNameTextField;
	
	@FindBy(id="Email")
	public WebElement EmailTextField;
	
	@FindBy(id="Password")
	public WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPasswordTextField;

}
