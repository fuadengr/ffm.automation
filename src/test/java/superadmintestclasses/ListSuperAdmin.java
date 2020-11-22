package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.ListSuperAdminPagePom;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListSuperAdmin {

	WebDriver driver;
	Login_pom login;
	ListSuperAdminPagePom listSadmin;
	
	@BeforeClass
	public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Techserve4u admin login
		
		login = new Login_pom(driver);
		
		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
		
	}

	@Test
	public void ListSupAdmin() {
		
		//Step 2: To view list super admin and delete admin
		
		listSadmin= new ListSuperAdminPagePom(driver);
		
		listSadmin.listSuperAdminButton();
		
		listSadmin.DeleteButton();
		
		listSadmin.closeButtonElement();
	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
