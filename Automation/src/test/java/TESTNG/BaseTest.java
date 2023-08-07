package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	

	public static WebDriver driver;
	
	@BeforeClass
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
}}
