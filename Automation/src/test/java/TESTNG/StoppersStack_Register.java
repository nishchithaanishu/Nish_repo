package TESTNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StoppersStack_Register extends BaseTest{
	@Test(priority=1)
	public void StopperStack() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Nishchitha");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("M M");
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("8951934910");
		driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("nishchitha00010@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nish@12345");
		driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Nish@12345");
		driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
		driver.findElement(By.id("btnDisabled")).click();
	}

	@Test(priority=2)
	public void stoppersStock_Login() throws InterruptedException 
	{
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nishchitha00010@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nish@12345");
		driver.findElement(By.id("Login")).click();		
}
	@Test(priority=3)
	public void LogOut() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-circular')]")).click();		
		driver.findElement(By.xpath("(//li[contains(@class,'MuiButtonBase-root')])[7]")).click();
	}	
}
