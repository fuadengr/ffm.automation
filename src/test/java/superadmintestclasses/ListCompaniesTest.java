package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.ListCompaniesPom;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListCompaniesTest {
	WebDriver driver;
	Login_pom login;
	ListCompaniesPom listcompany;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");

	}

	@Test
	public void LoginSadmin() {

		//Step 1: Techserve4u admin login
		
		login = new Login_pom(driver);
		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Step 2: To view list companies and update and delete
		
		listcompany = new ListCompaniesPom(driver);
		listcompany.listcompany();
		listcompany.companyListEdit();
		listcompany.DeleteCompany();
		listcompany.confirmButton();
		listcompany.closeButton();
		listcompany.Displayed();

	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
