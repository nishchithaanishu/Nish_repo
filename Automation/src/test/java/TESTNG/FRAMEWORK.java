package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FRAMEWORK {
	public static WebDriver driver;
	
    @Test
    @Parameters("BrowserName")
	@BeforeClass
	public void setupBrowser(@Optional("firefox")String BrowserName) {
    	
    	if(BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./testNG/chromedriver.exe");
        driver=new ChromeDriver();
    	}
    	else if(BrowserName.equalsIgnoreCase("firefox")) {
    	System.setProperty("webdriver.gecko.driver","./testNG/geckodriver.exe");
        driver=new FirefoxDriver(); 
       	}
    	else {
    		System.out.println("Give valid Browser name");
    	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/fiction");
	}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}

}
