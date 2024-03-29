package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import POM.LoginPage;

public class Tc_Login_001 extends BaseClass{
	@Test
	public void verify_user_can_able_to_login_using_credentials() {
	LoginPage lp = new LoginPage(driver);
	
	lp.getLoginLink().click();
	lp.getEmailTextBox().sendKeys("rakshitha.hn1992@gmail.com");
	lp.getPasswordTextField().sendKeys("Sanay@123");
	lp.getLoginButton().click();
		
	}
	@Test
	public void loginExcelData() throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("./TestData/AdvanceSeleniumTestData.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("data");
		Row row = sheet.getRow(1);
		System.out.println(row);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(2);
		String data1 = cell1.getStringCellValue();
		System.out.println(data1);
		
	    LoginPage lp = new LoginPage(driver);
	    lp.getLoginLink().click();
	    lp.getEmailTextBox().sendKeys(data);
	    lp.getPasswordTextField().sendKeys(data1);
	    lp.getLoginButton().click();
			
	}
	
}

