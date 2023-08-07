package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriventesting {
	@Test(dataProvider="logindata")
	public void logintest(String username, String password) {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com ");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='log in']")).click();
		driver.quit();
	}
	@DataProvider(name="loginData", parallel=true)
	public String[][] testData(){
		String[][] data=learningSinglereadExcel.readMultipledata("Log");
		return data;
		
	}
}
