package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page {
	public void BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	public WebElement Books_Link;
	
	@FindBy(id="products-orderby")
	public WebElement SortBydropdown;
	
	@FindBy(id="products-pagesize")
	public WebElement Display_Dropdown;
	
	@FindBy(id="products-viewmode")
	public WebElement viewasdropdown;

}
