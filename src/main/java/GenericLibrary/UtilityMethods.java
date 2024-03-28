package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	WebDriver driver;
	/**
	 * @param
	 * 
	 * @return String
	 */
	
	public String get_Title() {
		String title=driver.getTitle();
		return title;
	}
	/**
	 * 
	 * @return
	 */
	public String getCurrent_Url() {
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	/**
	 * 
	 * @param element_click
	 */

	public void click(WebElement element_click) {
		element_click.click();
	}
	/**
	 * 
	 * @param dropdown
	 * @param value
	 */
	
	public void selectDropDownByValue(WebElement dropdown, String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	/**
	 * 
	 * @param dropdown
	 * @param visibleText
	 */
	
	public void selectDropDownByVisibleText(WebElement dropdown, String visibleText) {
		Select select=new Select(dropdown);
		select.selectByValue(visibleText);
	}
}
