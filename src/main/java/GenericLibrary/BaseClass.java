package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

		public WebDriver driver;
		
		String actualUrl="https://demowebshop.tricentis.com/";
		
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Am before Suite");
			Reporter.log("BeforeSuite: DataBase Connection start",true);
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("Am after Suite");
			Reporter.log("AfterSuite: DataBase Connection stop",true);
		}
		@BeforeClass
		public void browserSetUp() throws InterruptedException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("User is able to open empty Browser", true);
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("User is able to open DemoWebSho",true);
			String url = driver.getCurrentUrl();
			
			if (url.equals(actualUrl)) {
				Reporter.log("User is able to open DemoWebShop HomePAge",true);
				
			} else {
				Reporter.log("USer is not able to open DemoWebShop", true);

			}
			Thread.sleep(3000);
		}
		
		@AfterClass
		public void toQuitBroswer() throws Throwable {
			
			Thread.sleep(3000);
			driver.quit();
			Reporter.log("User is able to close the DemoWebShop",true);
		}
		

	
}
