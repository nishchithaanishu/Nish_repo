package TESTNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(TESTNG.Listenerimplementation.class)
public class Learningassersion extends BaseTest{
	@Test
	public void testcase() {	SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Facebook");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nishchitham123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdefgghh");
//		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
//		Assert.assertTrue(true);
//		Assert.assertEquals("Hii", "Hii");
		Assert.assertTrue(driver.findElement(By.cssSelector("ico-logout")).isDisplayed());
     	ast.assertAll();
		}
}
