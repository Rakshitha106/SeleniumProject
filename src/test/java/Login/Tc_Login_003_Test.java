package Login;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadDataFromExternalFile;
import POM.LoginPage;

public class Tc_Login_003_Test extends BaseClass{
	@Test
	public void Verify_that_user_can_able_to_Login_with_invalid_emailID() throws Throwable {
		ReadDataFromExternalFile data = new ReadDataFromExternalFile();
		String email = data.readingTheDataFromExcelSheet("./TestData/SeleniumTestData.xlsx", "invalidData", 0, 0);
		String pwd = data.readingTheDataFromExcelSheet("./TestData/SeleniumTestData.xlsx", "invalidData", 0, 1);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys(email);
		lp.getPasswordTextField().sendKeys(pwd);
		lp.getLoginButton().click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://demowebshop.tricentis.com/")) {
			System.out.println("sucessfull Login");
			
		} else {
			System.out.println("invalid username or pwd");

		}
		
		
	}

}
