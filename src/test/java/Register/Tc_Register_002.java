package Register;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadDataFromExternalFile;
import GenericLibrary.UtilityMethods;
import POM.RegisterPage;

public class Tc_Register_002 extends BaseClass{
	@Test
	public void Verify_the_user_can_able_to_register_again_with_same_email() throws Throwable, Throwable {
		ReadDataFromExternalFile data = new ReadDataFromExternalFile();
		String[] firstName = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "regdata", 0);
		String[] lastName = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "regdata", 1);
		String[] email = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "regdata", 2);
		String[] pwd = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "regdata", 3);
		String[] cnfmPwd = data.readRowDataFromExcel("./TestData/SeleniumTestData.xlsx", "regdata", 4);
		
	   RegisterPage rp = new RegisterPage(driver);
	   rp.getRegisterLink().click();
	   rp.getGenderFemaleButton().click();
	   rp.getFirstNameTextBox().sendKeys(firstName);
	   rp.getLastNameTextBox().sendKeys(lastName);
	   rp.getEmailTextBox().sendKeys(email);
	   rp.getPasswordTextField().sendKeys(pwd);
	   rp.getConfirmPasswordTextField().sendKeys(cnfmPwd);
	   rp.getRegisterButton().click();
	   
	  UtilityMethods um = new UtilityMethods();
	 String url = driver.getCurrentUrl();
	 if (url.contains("https://demowebshop.tricentis.com/registerresult/1")) {
		 System.out.println("Registered sucessfull");
		
	} else {
		System.out.println("email already exist");

	}

	
	
	}

}
