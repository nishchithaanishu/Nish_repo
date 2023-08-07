package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SSS_AddToCart extends BaseTest{
	@Test(priority=1)
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nishchitha00010@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nish@12345");
		driver.findElement(By.id("Login")).click();
	}
	
	@Test(priority=2)
	public void Addtocart() throws InterruptedException {
       WebElement Electronics = driver.findElement(By.id("electronics"));

		Actions actions=new Actions(driver);
		actions.moveToElement(Electronics).build().perform();
	}

}
