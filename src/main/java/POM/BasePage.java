package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement searchBoxTextField;
	
	@FindBy(xpath = "//input[@value=\"Search\"]")
	private WebElement searchButton;

	public WebElement getSearchBoxTextField() {
		return searchBoxTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	

}
