package framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM_Repository.LoginPage;
import POM_Repository.WElcomePage;

public class Login_Using_POM extends Base_Test 
{

	@Test
	public void login() {
		WElcomePage welcomePage=new WElcomePage(driver);
		welcomePage.loginlink.click();
		LoginPage login=new LoginPage(driver);
		login.emailTextField.sendKeys("nishchitha122gmail.com");
		login.PasswordTextField.sendKeys("123456789");
		login.loginButton.click();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
		System.out.println("PASS:User is logged in");
	} else {
		System.out.println("Fail: User is not logged in");
	}

}

}
