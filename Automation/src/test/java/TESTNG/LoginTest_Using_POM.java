package TESTNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM_Repository.LoginPage;
import POM_Repository.WElcomePage;

public class LoginTest_Using_POM extends BaseTest
{

		@Test
		public void login() {
			WElcomePage welcomePage=new WElcomePage(driver);
			welcomePage.loginlink.click();
			LoginPage login=new LoginPage(driver);
			login.emailTextField.sendKeys("nishchitham123@gmail.com");
			login.PasswordTextField.sendKeys("123456");
			login.loginButton.click();
			
			if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("PASS:User is logged in");
		} else {
			System.out.println("Fail: User is not logged in");
		}

	}

	}



