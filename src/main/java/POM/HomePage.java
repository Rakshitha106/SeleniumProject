package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class=\"header-logo\"]")
	private WebElement headerLogo;
	
	@FindBy(id = "small-searchterms")
	private WebElement SearchBar;
	
	@FindBy(className = "ico-register")
	private WebElement registerIcon;
	
	@FindBy(className = "ico-login")
	private WebElement loginIcon;
	
	@FindBy(className = "cart-label")
	private WebElement shopping_cartIcon;
	
	@FindBy(className = "ico-wishlist")
	private WebElement wishlistIcon;
	
	@FindBy(linkText = "Categories")
	private WebElement catogoriesIcon;
	
	@FindBy(linkText = "Manufacturers")
	private WebElement manufacturerIcon;
	
	@FindBy(linkText = "Popular tags")
	private WebElement popular_tagsIcon;
	
	@FindBy(linkText = "Books")
	private WebElement booksIcon;
	
	@FindBy(linkText = "Computers")
	private WebElement computerIcon;
	
	@FindBy(linkText = "Electronics")
	private WebElement electronicsIcon;
	
	public WebElement getHeaderLogo() {
		return headerLogo;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getBooksIcon() {
		return booksIcon;
	}

	public WebElement getComputerIcon() {
		return computerIcon;
	}

	public WebElement getElectronicsIcon() {
		return electronicsIcon;
	}

	public WebElement getRegisterIcon() {
		return registerIcon;
	}

	public WebElement getLoginIcon() {
		return loginIcon;
	}

	public WebElement getShopping_cartIcon() {
		return shopping_cartIcon;
	}

	public WebElement getWishlistIcon() {
		return wishlistIcon;
	}

	public WebElement getCatogoriesIcon() {
		return catogoriesIcon;
	}

	public WebElement getManufacturerIcon() {
		return manufacturerIcon;
	}

	public WebElement getPopular_tagsIcon() {
		return popular_tagsIcon;
	}
	

}
