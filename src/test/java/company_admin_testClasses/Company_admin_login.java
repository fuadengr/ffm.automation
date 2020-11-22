package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Company_admin_login {
	WebDriver driver;
	 Company_admin_login_pom login;
	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
	}

	@Test
	public void LoginSAdmin() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Step 1: Company admin login
		login= new Company_admin_login_pom(driver);
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
	}

	@AfterClass
	public void afterClass() {
		  //Step 2: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
