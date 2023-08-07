

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class learnAssertions {
		WebDriver driver;

		@Test
		public void defaultCheckBoxStatus() {
			SoftAssert soft = new SoftAssert();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com/login.do");
			WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
			keepLoggedInCheckBox.click();
			//check the status of the checkbox - for not being  not - selected by default
			soft.assertFalse
			(keepLoggedInCheckBox.isSelected(), 
					"keepLoggedInCheckBox is Selected by default.");
			//If it is not selected click.
			keepLoggedInCheckBox.click();
			driver.manage().window().minimize();
			driver.quit();
			soft.assertAll();
			
			

		}

	}
