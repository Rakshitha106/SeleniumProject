package Register;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadDataFromExternalFile;
import POM.RegisterPage;

public class Tc_Resgister_001 extends BaseClass {
	@Test
	public void verify_User_Can_Able_to_Register_with_valid_Data() throws Throwable, Throwable {
		
		ReadDataFromExternalFile data = new ReadDataFromExternalFile();
		String[] firstName = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "newregdata", 0);
		String[] lastName = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "newregdata", 1);
		String[] email = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "newregdata", 2);
		String[] pwd = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "newregdata", 3);
		String[] cnfmPwd = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "newregdata", 4);
		
		RegisterPage rp = new RegisterPage(driver);
		rp.getRegisterLink().click();
		rp.getGenderFemaleButton().click();
		rp.getFirstNameTextBox().sendKeys(firstName);
		rp.getLastNameTextBox().sendKeys(lastName);
		rp.getEmailTextBox().sendKeys(email);
		rp.getPasswordTextField().sendKeys(pwd);
		rp.getConfirmPasswordTextField().sendKeys(cnfmPwd);
		rp.getRegisterButton().click();
		
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 if (url.contains("https://demowebshop.tricentis.com/registerresult/1")) {
			 System.out.println("Registered sucessfull");
			
		} else {
			System.out.println("email already exists");

		}

		
		
	}

}
