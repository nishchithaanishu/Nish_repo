package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
	}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}

}
