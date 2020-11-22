package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.CompanyaAdminList;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class CompanyAdminList {
	WebDriver driver;
	Company_admin_login_pom CLoginPom;
	CompanyaAdminList ListPom;

	@BeforeClass
	public void beforeTest() {

		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		CLoginPom = new Company_admin_login_pom(driver);
		CLoginPom.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@Test
	public void company_adminLogin() {
		 
		//Step 2: To view company admin list
		
		ListPom = new CompanyaAdminList(driver);
		ListPom.companyAdminList();
		ListPom.Deletebtn();
		ListPom.close();
	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
