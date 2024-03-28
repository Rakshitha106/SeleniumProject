package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id="gender-male")
	private WebElement genderMaleButton;
	
	@FindBy(id = "gender-female")
	private WebElement genderFemaleButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(name = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGenderMaleButton() {
		return genderMaleButton;
	}

	public WebElement getGenderFemaleButton() {
		return genderFemaleButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

}
