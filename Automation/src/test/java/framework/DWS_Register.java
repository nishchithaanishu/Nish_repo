package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_Register {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Nishchitha");
		driver.findElement(By.id("LastName")).sendKeys("M M");
		driver.findElement(By.id("Email")).sendKeys("nishchithamm1606@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
		driver.findElement(By.id("register-button")).click();

		
	}

}
