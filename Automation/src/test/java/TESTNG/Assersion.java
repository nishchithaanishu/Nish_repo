package TESTNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assersion extends BaseTest{
	@Test
	public void testcase() {
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Facebook");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nishchitham123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Assert.assertTrue(true);
		Assert.assertEquals("Hii", "Hii");
		Assert.assertTrue(driver.findElement(By.cssSelector("ico-logout")).isDisplayed());
		ast.assertAll();
		
		
	
		}

}
