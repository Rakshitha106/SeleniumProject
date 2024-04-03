package Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadDataFromExternalFile;
import POM.LoginPage;

public class Tc__Login_002_Test extends BaseClass{
	@Test
	public void verify_user_can_able_to_login_withExcelData() throws Throwable {
		ReadDataFromExternalFile excelData = new ReadDataFromExternalFile();
		String email = excelData.readingTheDataFromExcelSheet("./TestData/SeleniumTestData.xlsx","data", 1, 1);
		System.out.println(email);
		String pwd = excelData.readingTheDataFromExcelSheet("./TestData/SeleniumTestData.xlsx","data", 1, 2);
		System.out.println(pwd);
		
		
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys(email);
		lp.getPasswordTextField().sendKeys(pwd);
		lp.getLoginButton().click();
		
		Reporter.log("Registered Succesfully",true);
		
	}

}
