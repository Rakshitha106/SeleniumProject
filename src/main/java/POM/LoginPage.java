package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(name = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
