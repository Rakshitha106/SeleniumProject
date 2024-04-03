package Cart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.HomePage;

public class Tc_AddToCart_001_Test extends BaseClass{
	@Test
	public void Verify_that_user_can_Able_to_add_Item_to_car() {
		
		HomePage hp = new HomePage(driver);
		
		hp.getElectronicsIcon().click();
		driver.findElement(By.linkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()=\"Smartphone\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-43\"]")).click();
		
	}

}
