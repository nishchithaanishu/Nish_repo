package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test(threadPoolSize=2, invocationCount=4)
public class parallel_exe {
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Book");
		driver.findElement(By.id("Email")).sendKeys("nishchitham123@gmail.com");
		driver.findElement(By.className("password")).sendKeys("123456");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.quit();

	}
}
