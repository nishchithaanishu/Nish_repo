package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parameter_base_class1 {
public static WebDriver driver;
	

     @Parameters("URL")
	@BeforeClass
	public void setupBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}
}
