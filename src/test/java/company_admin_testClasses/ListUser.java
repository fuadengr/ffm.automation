package company_admin_testClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import company_admin_pom.ListUserPom;
import company_admin_pom.Company_admin_login_pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListUser {
	WebDriver driver;
	Company_admin_login_pom login;
	ListUserPom Luser;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login = new Company_admin_login_pom(driver);
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
	}

	@Test
	public void Listuser() {
		
		//Step 2: To view list user and update
		
		Luser = new ListUserPom(driver);
		Luser.listUserSide();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Luser.edit();
		Luser.Lnameedit("Noor");
		Luser.Fnameedit("Aleaha");
		
		
		Luser.insideEditbtn();

	}

	/*
	 * @Test public void Delete() { login = new company_admin_login_pom(driver);
	 * login.LogincompanyAdmin("california@yahoo.com", "1asdf234"); Luser= new
	 * ListUserPom(driver); Luser.listUserSide(); Luser.delete();
	 * Luser.closeButtoN();
	 * 
	 * }
	 */

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
